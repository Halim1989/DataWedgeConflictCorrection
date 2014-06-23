package com.example.dwdemo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class DWActivity extends Activity {

	private static final String ACTION_SOFTSCANTRIGGER = "com.motorolasolutions.emdk.datawedge.api.ACTION_SOFTSCANTRIGGER";
	private static final String EXTRA_PARAM = "com.motorolasolutions.emdk.datawedge.api.EXTRA_PARAMETER";
	private static final String DWAPI_START_SCANNING = "START_SCANNING";
	private static final String scannerInputPlugin = "com.motorolasolutions.emdk.datawedge.api.ACTION_SCANNERINPUTPLUGIN";

	private String state;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle extra = getIntent().getExtras();
		state = extra.getString("state");
				
	}

	@Override
	public void onResume() {
		super.onResume();
		
		Intent i = new Intent();
		i.setAction(scannerInputPlugin);
		i.putExtra(EXTRA_PARAM, state);
		sendBroadcast(i);

		Intent result = new Intent();
		result.putExtra("state", state);
		setResult(RESULT_OK , result);

		finish();		
	}
}
