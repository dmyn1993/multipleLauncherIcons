package com.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class SecondActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		Intent broadcastIntent = new Intent("com.dmyn1993.mli.Second");
        sendBroadcast(broadcastIntent);
		finish();
    }
    
}
