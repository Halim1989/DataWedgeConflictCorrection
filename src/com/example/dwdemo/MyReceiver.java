package com.example.dwdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

	private static final String ACTION_SOFTSCANTRIGGER = "com.motorolasolutions.emdk.datawedge.api.ACTION_SOFTSCANTRIGGER";
	private static final String EXTRA_PARAM = "com.motorolasolutions.emdk.datawedge.api.EXTRA_PARAMETER";
	private static final String DWAPI_START_SCANNING = "START_SCANNING";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		// assumes WordService is a registered service	
	}
}