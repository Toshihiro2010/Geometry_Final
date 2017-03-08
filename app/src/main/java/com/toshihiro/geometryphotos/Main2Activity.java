package com.toshihiro.geometryphotos;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ssru.toshihiro.geometryphoto.R;

public class Main2Activity extends Activity implements View.OnClickListener {

    private Button btnCamera;
    private Button btnLearn;
    private Button btnForGeo;
    private Button btnHowto;
    private Button btnExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bindVidget();
        btnClick();

    }

    private void btnClick() {
        btnCamera.setOnClickListener(this);
        btnLearn.setOnClickListener(this);
        btnForGeo.setOnClickListener(this);
        btnHowto.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    private void bindVidget() {
        btnCamera = (Button) findViewById(R.id.btnCamera);
        btnLearn = (Button) findViewById(R.id.btnLearn);
        btnForGeo = (Button) findViewById(R.id.btnForGeo);
        btnHowto = (Button) findViewById(R.id.btnHowto);
        btnExit = (Button) findViewById(R.id.btnExit);

    }

    @Override
    public void onClick(View view) {
        MediaPlayer mp = new MediaPlayer().create(Main2Activity.this,R.raw.effect_btn_shut);
        mp.start();
        if(view == btnCamera){
            forCameraStart();
        } else if (view == btnExit) {
            closeActivity();
        } else if (view == btnHowto){
            Toast.makeText(Main2Activity.this, "ฟังก์ชันนี้ยังไม่พร้อมใช้งาน", Toast.LENGTH_SHORT).show();
        } else if (view == btnForGeo) {
            forMuStart();
        } else if (view == btnLearn) {
            Toast.makeText(Main2Activity.this, "ฟังก์ชันนี้ยังไม่พร้อมใช้งาน", Toast.LENGTH_SHORT).show();
        }

    }

    private void forCameraStart() {
        Intent intent = new Intent(this, MainActivity.class);
        //Intent intent = new Intent(this , My_CameraCv.class);
        startActivity(intent);

    }

    private void forMuStart() {
        Intent intent = new Intent(this,FormulatorGeometry.class);
        startActivity(intent);
    }

    private void closeActivity() {
        finish();
    }
}