package com.example.dwdemo;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends Activity {

	private static final String ACTION_SOFTSCANTRIGGER = "com.motorolasolutions.emdk.datawedge.api.ACTION_SOFTSCANTRIGGER";
	private static final String EXTRA_PARAM = "com.motorolasolutions.emdk.datawedge.api.EXTRA_PARAMETER";
	private static final String DWAPI_START_SCANNING = "START_SCANNING";
	private static final String SCANNER_INPUT_PLUGIN = "com.motorolasolutions.emdk.datawedge.api.ACTION_SCANNERINPUTPLUGIN";

	private MainActivity act;
	protected DWDemo dwdemo;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		act = this;
		dwdemo = (DWDemo) this.getApplicationContext();
	}

	@Override
	public void onResume() {

		super.onResume();
		dwdemo.changeStatus("ENABLE_PLUGIN");

	}

	public void launchDataWedge(View v) {

		Intent i = new Intent();

		i.setAction(ACTION_SOFTSCANTRIGGER);

		i.putExtra(EXTRA_PARAM, DWAPI_START_SCANNING);

		sendBroadcast(i);

	}

	public void disableDW(View v) {
		dwdemo.changeStatus("DISABLE_PLUGIN");

		final Handler handler = new Handler();

		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(act, CamActivity.class);
				startActivity(intent);
			}
		}, 500);
	}

}