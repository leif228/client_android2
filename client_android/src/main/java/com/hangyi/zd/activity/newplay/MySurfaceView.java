package com.hangyi.zd.activity.newplay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.hangyi.zd.activity.gridviewpage.AppAdapter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017-04-19.
 */

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder mHolder; // 用于控制SurfaceView
    private ExecutorService pool;

    // 线程运行的标识，用于控制线程
    public boolean flag;
    private Canvas mCanvas; // 声明一张画布

    private int width;
    private int height;

    public MySurfaceView(Context context) {
        super(context);
    }
    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(ExecutorService pool){
        this.pool = pool;
        // 获得SurfaceHolder对象
        mHolder = getHolder();
        mHolder.addCallback(this); // 为SurfaceView添加状态监听

//        height=this.getMeasuredHeight();
//        width=this.getMeasuredWidth();
    }
    /**
     * 自定义一个方法，在画布上画一个圆
     */
    private void drawDefault() {
        Bitmap b = ShipDynamicFragment.home_defaultBitmap;
        b = zoomImg(b,width,height);

        Canvas c = mHolder.lockCanvas(new Rect(0, 0, width, height));
        c.drawBitmap(b, 0, 0, new Paint());

        mHolder.unlockCanvasAndPost(c);// 更新屏幕显示内容
    }
    /**
     * 当SurfaceView创建的时候，调用此函数
     */
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        width = this.getWidth();
        height = this.getHeight();

        drawDefault();
    }
    /**
     * 当SurfaceView的视图发生改变的时候，调用此函数
     */
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
    }
    /**
     * 当SurfaceView销毁的时候，调用此函数
     */
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        flag = false; // 把线程运行的标识设置成false
    }

    public void drawImg(DrawTask task){
        pool.execute(task);

    }

    public class DrawTask implements Runnable{
        private String imgUrl ;
        private String imgTime ;

        public DrawTask(String imgUrl, String imgTime) {
            this.imgUrl = imgUrl;
            this.imgTime = imgTime;
        }

        @Override
        public void run() {
            if(imgUrl != null){
                Bitmap b = AppAdapter.createDrawable2(BitmapFactory.decodeFile(imgUrl), null, imgTime);
                b = zoomImg(b,width,height);

                Canvas c = mHolder.lockCanvas(new Rect(0, 0, width, height));
                if(c!=null){

                    c.drawBitmap(b, 0, 0, new Paint());

                    mHolder.unlockCanvasAndPost(c);// 更新屏幕显示内容
                }
            }else {
                Bitmap b = AppAdapter.createDrawable2(ShipDynamicFragment.lose_gpsBitmap, null, imgTime);
                b = zoomImg(b,width,height);

                Canvas c = mHolder.lockCanvas(new Rect(0, 0, width, height));
                if(c!=null){

                    c.drawBitmap(b, 0, 0, new Paint());

                    mHolder.unlockCanvasAndPost(c);// 更新屏幕显示内容
                }
            }

        }
    }

    /**
     *  处理图片
     * @param bm 所要转换的bitmap
     * @param newWidth 新的宽
     * @param newHeight 新的高
     * @return 指定宽高的bitmap
     */
    private static Bitmap zoomImg(Bitmap bm, int newWidth ,int newHeight){
        if(bm == null)
            return ShipDynamicFragment.home_defaultBitmap;
        // 获得图片的宽高
        int width = bm.getWidth();
        int height = bm.getHeight();
        // 计算缩放比例
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;
        // 取得想要缩放的matrix参数
        Matrix matrix = new Matrix();
        matrix.postScale(scaleWidth, scaleHeight);
        // 得到新的图片
        Bitmap newbm = Bitmap.createBitmap(bm, 0, 0, width, height, matrix, true);
        return newbm;
    }

}
