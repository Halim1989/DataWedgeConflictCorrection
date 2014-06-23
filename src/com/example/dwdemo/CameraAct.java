package com.example.dwdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CameraAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera);
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	public void takePicture(View v) {
		Intent i = new Intent(this, CamActivity.class);
		startActivity(i);
	}
}
