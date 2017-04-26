package com.hangyi.zd.activity.newplay;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.widget.Toast;

import com.eyunda.third.loaders.Data_loader;
import com.eyunda.tools.CalendarUtil;
import com.hangyi.tools.Util;
import com.hangyi.zd.domain.StartTimeEndTimeData;
import com.hangyi.zd.play.StartTimeEndTimeQueue;
import com.ta.util.http.PersistentCookieStore;

import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImgDownLoadService2 extends Service {
	private ExecutorService pool ;
	private Data_loader dataLoader;
	private static final int threadNum = 8;
	private static final int mins = 10;

	private static final int START_lOADIMG = 100;
	private static final int STOP_lOADIMG = 200;
	public static final int SENDTO_CLIENT = 300;
	public static final int test = 400;

	Messenger mMessenger = new Messenger(new ServiceHandler());
	Messenger client;

	class ServiceHandler extends Handler {
		@Override
		public void handleMessage(Message msg) {
			client = msg.replyTo;

			switch (msg.what) {
				case START_lOADIMG:
					Bundle bundle = msg.getData();
					String shipId = bundle.getString("shipId");
					ArrayList chanls = bundle.getCharSequenceArrayList("chanls");
					String startTime = bundle.getString("startTime");
					String endTime = bundle.getString("endTime");

					final String PHPSESSID = bundle.getString("PHPSESSID");
					bundlePHP(PHPSESSID);

					try{
						Message msgtest = Message.obtain(null, ImgDownLoadService2.test, 8, 0);
						client.send(msgtest);
					}catch (Exception e){}

					startThreadLoadImg(shipId,chanls,CalendarUtil.parseYYYY_MM_DD_HH_MM_SS(startTime),CalendarUtil.parseYYYY_MM_DD_HH_MM_SS(endTime));
					break;
				case STOP_lOADIMG:
					stopThreadLoadImg();
					break;
				default:
					super.handleMessage(msg);
			}
		}
	}

	
    @Override  
    public void onCreate() {  
        super.onCreate();
		Log.i("ImgDownLoadService2","onCreated");
		dataLoader = new Data_loader();
    }

	public void bundlePHP(final String PHPSESSID){
		//TODO取得cookie传给dataLoader
		PersistentCookieStore myCookieStore = new PersistentCookieStore(this);

		Cookie c = new Cookie() {
			@Override
			public String getName() {
				return "PHPSESSID";
			}

			@Override
			public String getValue() {
				return PHPSESSID;
			}

			@Override
			public String getComment() {
				return null;
			}

			@Override
			public String getCommentURL() {
				return null;
			}

			@Override
			public Date getExpiryDate() {
				return null;
			}

			@Override
			public boolean isPersistent() {
				return false;
			}

			@Override
			public String getDomain() {
				return null;
			}

			@Override
			public String getPath() {
				return null;
			}

			@Override
			public int[] getPorts() {
				return new int[0];
			}

			@Override
			public boolean isSecure() {
				return false;
			}

			@Override
			public int getVersion() {
				return 0;
			}

			@Override
			public boolean isExpired(Date date) {
				return false;
			}
		};
		myCookieStore.addCookie(c);
		dataLoader.asyncHttpClient.setCookieStore(myCookieStore);
	}
    
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
    	
    	return super.onStartCommand(intent, flags, startId);
    } 
  
    @Override  
    public void onDestroy() { 
    	super.onDestroy();  
    	if(pool!=null){
    		pool.shutdownNow();
    		pool = null;
    	}
    }

	@Override
	public IBinder onBind(Intent intent) {
		Log.i("ImgDownLoadService2","onBind");
		//返回给客户端一个IBinder实例
		return mMessenger.getBinder();
	}  
	

	    private void startThreadLoadImg(String shipID, List<String> channels, Calendar start, Calendar end) {
	    	initStartTimeEndTimeQueue(start ,end);
	    	
	    	if(pool!=null){
	    		pool.shutdownNow();
	    		pool = null;
	    	}
	    	
	    	pool = Executors.newFixedThreadPool(threadNum);
	    	
	    	//1.并行加载
//			for(int i=0;i<threadNum;i++){
//				pool.execute(new LoadImgRunnable(shipID ,dataLoader, channels, mBinderService));
//			}
	    	
	    	//2.顺序加载
	    	StartTimeEndTimeData data;
			while ((data = StartTimeEndTimeQueue.getInstance().poll()) != null) {
				pool.execute(new LoadImgRunnable3(client,shipID ,dataLoader, channels, data));
			}
		}
	    
	    private void stopThreadLoadImg(){
	    	if(pool!=null){
	    		pool.shutdownNow();
	    		pool = null;
	    	}
	    }

	private void initStartTimeEndTimeQueue(Calendar start, Calendar end) {
		StartTimeEndTimeQueue.getInstance().clear();
		
		start = CalendarUtil.getTheSecondZero(start);
		end = CalendarUtil.getTheSecondZero(end);
		
		long timeOne=start.getTimeInMillis();
		long timeTwo=end.getTimeInMillis();
		int minute=(int) ((timeTwo-timeOne)/(1000*60));//转化minute
		
		if(minute<=mins){
			StartTimeEndTimeData sd = new StartTimeEndTimeData();
			sd.setStartTime(CalendarUtil.toYYYY_MM_DD_HH_MM_SS(start));
			sd.setEndTime(CalendarUtil.toYYYY_MM_DD_HH_MM_SS(end));
			
			StartTimeEndTimeQueue.getInstance().offer(sd);
		}else{
			while (true) {
				Calendar tempc = CalendarUtil.addMinutes(start, mins);
				if(tempc.getTimeInMillis()<end.getTimeInMillis()){
					StartTimeEndTimeData sd = new StartTimeEndTimeData();
					sd.setStartTime(CalendarUtil.toYYYY_MM_DD_HH_MM_SS(start));
					sd.setEndTime(CalendarUtil.toYYYY_MM_DD_HH_MM_SS(tempc));
					sd.setMins(this.getMins(start, tempc));
					
					StartTimeEndTimeQueue.getInstance().offer(sd);
					
//					tempc = CalendarUtil.addMinutes(tempc, 1); //下一分钟0-30,31-61
					start = tempc;
				}else{
					StartTimeEndTimeData sd = new StartTimeEndTimeData();
					sd.setStartTime(CalendarUtil.toYYYY_MM_DD_HH_MM_SS(start));
					sd.setEndTime(CalendarUtil.toYYYY_MM_DD_HH_MM_SS(end));
					sd.setMins(this.getMins(start, end));
					
					StartTimeEndTimeQueue.getInstance().offer(sd);
					
					break;
				}
			}
		}
	}
	
	private int getMins(Calendar start,Calendar end){
		long timeOne=start.getTimeInMillis();
		long timeTwo=end.getTimeInMillis();
		int minute=(int) ((timeTwo-timeOne)/(1000*60));//转化minute
		
		return minute;
	}

}
