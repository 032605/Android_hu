package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrameActivity extends AppCompatActivity {

    private Button      btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }

    // 버튼 누르면 사라지기
    public void onClick(View v){

        v.setVisibility(View.GONE);
    }


}