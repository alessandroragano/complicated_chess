package com.mobileapp.polimi.maprojectg4.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mobileapp.polimi.maprojectg4.R;
import com.mobileapp.polimi.maprojectg4.controller.MainActivity;
import com.mobileapp.polimi.maprojectg4.controller.SoundService;


public class LoadingScreen extends Activity {

    //Introduce an delay
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Intent music = new Intent();
        music.setClass(this,SoundService.class);
        startService(music);

    }

    public void goToMain(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
