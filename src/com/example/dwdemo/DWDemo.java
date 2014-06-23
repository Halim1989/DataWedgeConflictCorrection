package com.example.dwdemo;

import android.app.Application;
import android.content.Intent;

public class DWDemo extends Application {

	private static final String EXTRA_PARAM = "com.motorolasolutions.emdk.datawedge.api.EXTRA_PARAMETER";	
	private static final String SCANNER_INPUT_PLUGIN = "com.motorolasolutions.emdk.datawedge.api.ACTION_SCANNERINPUTPLUGIN";
	
	@Override
	public void onCreate() {
		super.onCreate();
		
	}
	
	public void changeStatus(String state){
		Intent i = new Intent();
		i.setAction(SCANNER_INPUT_PLUGIN);
		i.putExtra(EXTRA_PARAM, state);
		sendBroadcast(i);
	}
}
