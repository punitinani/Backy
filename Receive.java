package com.example.backy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;

public class Receive extends BroadcastReceiver {

	Context c2;

	public static String NOTIFICATION_ID = "notification-id";
	public static String NOTIFICATION = "notification";

	@Override
	public void onReceive(Context context, Intent intent) {

		AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

		Intent i = new Intent(context, ss.class);
		i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

		switch (am.getRingerMode()) {
		case AudioManager.RINGER_MODE_SILENT:

			context.startActivity(i);
			break;

		case AudioManager.RINGER_MODE_VIBRATE:

			context.startActivity(i);
			break;

		case AudioManager.RINGER_MODE_NORMAL:

			context.startActivity(i);
			break;
		}

	}
}
