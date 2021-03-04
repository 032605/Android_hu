package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RelativeActivity extends AppCompatActivity {

    //---------------------------------------------------------
    // member Variable -----------------------------------------
    //---------------------------------------------------------

    //---------------------------------------------------------
    // member Method - override Method
    //---------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //사용자에게 보여지는 화면 설정
        setContentView(R.layout.relative_talk);
    }

}