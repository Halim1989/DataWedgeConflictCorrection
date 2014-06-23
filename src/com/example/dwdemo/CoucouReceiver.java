package com.example.dwdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CoucouReceiver extends BroadcastReceiver {
	private static final String NOM_USER = "sdz.chapitreTrois.intent.extra.NOM";

	@Override
	public void onReceive(Context context, Intent intent) {

		if (intent.getAction().equals("ACTION_COUCOU")) {
			System.out.println("salem");
		}
	}
}