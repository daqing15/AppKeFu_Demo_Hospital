package com.appkefu.appkehu_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class HosKaiyanjiaoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hos_kaiyanjiao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hos_kaiyanjiao, menu);
		return true;
	}

	public void back(View v)
	{
		finish();
	}
}
