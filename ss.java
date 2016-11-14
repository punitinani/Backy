package com.example.backy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ss extends Activity {

	public void onCreate(Bundle b) {

		super.onCreate(b);
		setContentView(R.layout.activity_main);

		try {
			Thread.sleep(200);

			Intent config = new Intent(Intent.ACTION_MAIN);
			config.addCategory(Intent.CATEGORY_HOME);
			config.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

			startActivity(config);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
