package com.hangyi.zd.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.eyunda.main.CommonActivity;
import com.eyunda.main.view.DialogUtil;
import com.eyunda.third.ApplicationConstants;
import com.eyunda.third.ApplicationUrls;
import com.eyunda.third.GlobalApplication;
import com.eyunda.third.activities.NewPageHomeMainActivity;
import com.eyunda.third.loaders.Data_loader;
import com.hangyi.tools.PasswordCheck;
import com.hangyi.tools.Security;
import com.hangyi.zd.R;
import com.hangyi.zd.ReLoginListenerService;
import com.ta.util.http.AsyncHttpResponseHandler;

import java.util.HashMap;
import java.util.Map;

//import com.eyunda.third.activities.account.BankListActivity;
//import com.eyunda.third.activities.account.BindBankCardActivity;
/**
 * 强制修改密码页面
 */
public class ModifyPwd extends CommonActivity {
	Data_loader data;
	EditText pwd1, pwd2, pwd3;
	Button submit;
	DialogUtil dialogUtil;
	ProgressDialog dialog;
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.eyd_user_modifypwd);
		dialogUtil = new DialogUtil(this);
		data = new Data_loader();
		
		sp = getSharedPreferences( "UserInfoConfig", MODE_PRIVATE);

		pwd1 = (EditText) findViewById(R.id.pwd1);
		pwd2 = (EditText) findViewById(R.id.pwd2);
		pwd3 = (EditText) findViewById(R.id.pwd3);
		submit = (Button) findViewById(R.id.submit);

		submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (pwd1.getText().toString().equals("")) {

					Toast.makeText(ModifyPwd.this, "原密码不能为空", Toast.LENGTH_SHORT)
							.show();
					return;
				}
				if (pwd2.getText().toString().equals("")) {

					Toast.makeText(ModifyPwd.this, "新密码不能为空",
							Toast.LENGTH_SHORT).show();
					return;
				}
				if (pwd3.getText().toString().equals("")) {

					Toast.makeText(ModifyPwd.this, "确认密码不能为空",
							Toast.LENGTH_SHORT).show();
					return;
				}
				if (!pwd3.getText().toString()
						.equals(pwd2.getText().toString())) {

					Toast.makeText(ModifyPwd.this, "两次密码不相同",
							Toast.LENGTH_SHORT).show();
					return;
				}
				if(!PasswordCheck.isLetterDigit(pwd3.getText().toString())){
					Toast.makeText(ModifyPwd.this, "密码必须包含数字与字母8位到20位",
							Toast.LENGTH_LONG).show();
					return;
				}
				loadData();
			}
		});
		
	}


	@Override
	protected void onStart() {
		super.onStart();
		setTitle("修改密码");
	}
	private void saveOptionInfo() {		
		SharedPreferences sp = this.getSharedPreferences("UserInfoConfig", Context.MODE_PRIVATE);
		Editor editor = sp.edit();
		String userPassword = pwd3.getText().toString().trim();
		editor.putString("UserPassword", userPassword);
		
		editor.commit();
	}
	private void loadData() {
		Map<String, Object> apiParams = new HashMap<String, Object>();
		apiParams.put("username", Security.encrypt(sp.getString("UserName", ""),ApplicationConstants.AES_KEY));
		apiParams.put("oldpasswd", Security.encrypt(pwd1.getText().toString().trim(),ApplicationConstants.AES_KEY));
		apiParams.put("newpasswd", Security.encrypt(pwd3.getText().toString().trim(),ApplicationConstants.AES_KEY));
		apiParams.put("clienttype", ApplicationConstants.clienttype);
		apiParams.put("version", "201902");
		
		data.getZd_ApiResult(new AsyncHttpResponseHandler() {
			@Override
			public void onStart() {
				super.onStart();
				dialog = dialogUtil.loading("提交中", "请稍候...");
			}
			@Override
			public void onSuccess(String content) {
				super.onSuccess(content);
				dialog.dismiss();
				
				if("0".equals(content)){
					saveOptionInfo();
					GlobalApplication.getInstance().startPush();

					Intent intent = new Intent(ModifyPwd.this,ReLoginListenerService.class);
					ModifyPwd.this.startService(intent);
					startActivity(new Intent(ModifyPwd.this,NewPageHomeMainActivity.class));
					finish();
				}else if("-1".equals(content)) {
					Toast.makeText(ModifyPwd.this, "原密码错误",
							Toast.LENGTH_LONG).show();
				}else if("-3".equals(content)) {
					Toast.makeText(ModifyPwd.this, "找不到用户",
							Toast.LENGTH_LONG).show();
				}else {
					Toast.makeText(ModifyPwd.this, "未知错误",
							Toast.LENGTH_LONG).show();
				}
				
								
			}
			@Override
			public void onFailure(Throwable error, String content) {
				super.onFailure(error, content);
				dialog.dismiss();
				if (content != null && content.equals("can't resolve host"))
					Toast.makeText(ModifyPwd.this, "网络连接异常",
							Toast.LENGTH_LONG).show();
				else if (content != null && content.equals("socket time out")) {
					Toast.makeText(ModifyPwd.this, "连接服务器超时",
							Toast.LENGTH_LONG).show();
				} else if (content != null) {
					Toast.makeText(ModifyPwd.this, content,
							Toast.LENGTH_LONG).show();
				} else
					Toast.makeText(ModifyPwd.this, "未知异常",
							Toast.LENGTH_LONG).show();

			}
		}, ApplicationUrls.login, apiParams, "post");
	
	}
}
