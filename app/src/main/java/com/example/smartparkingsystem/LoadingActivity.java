package com.example.smartparkingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoadingActivity extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_loading);

        Global.setTimeOut(SPLASH_DISPLAY_LENGTH, new Global.callbackRun() {
            @Override
            public void toRun() {

            }
        });
    }
}
