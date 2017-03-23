package com.wearable.sunshine.sunshinewearableapp;


import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by deepikan on 3/22/17.
 */

public class WatchDataRecieverService extends WearableListenerService {
    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        Log.v("message recieved","message received");
        String message = new String(messageEvent.getPath());
        Log.v("message = ",message);

        String message1 = new String(messageEvent.getData());
        Log.v("message1 = ",message1);


    }
/*
    private void showToast(String message) {
        //Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }*/
}
