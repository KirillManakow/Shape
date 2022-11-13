package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_land);
    }

   public void Add_bt(View v) {
    Intent intent = new Intent(this, Reg.class);
      startActivity(intent);
       finish();
   }

    public void detectOrientation(View v){
        Context appContext = getApplicationContext();
        Configuration configuration = getResources().getConfiguration();
        if(configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(appContext, "Портретная ориентация", Toast.LENGTH_LONG).show();
        }
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(appContext, "Альбомная ориентация", Toast.LENGTH_LONG).show();
        }
    }

}