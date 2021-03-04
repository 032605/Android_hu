package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // 멤버 변수 선언 -------------------------------
    // ---------------------------------
    // Debug -------------------------------------------
        private final static String TAG = "First Project";  // Log 출력 시 구분자 activity 이름도 가능한
    // ---------------------------------

    // UI --------------------------------------------------
        private LinearLayout    JoinEvent;
        private Random          random = new Random();
        private TextView        titleinv;

    // 멤버 메서드  -------------------------------

    // ---------------------------------
    // AppCompatActivity's method -------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //사용자에게 보여지는 화면 설정
        setContentView(R.layout.padding_margin);
        // 디버깅을 위한 로그 출력
        Log.i(TAG, "oncreate()");
        // 간단한 메시지 창 띄우기, 반드시 show()해야지 화면에 보인다!~!!!!!!
        Toast.makeText(MainActivity.this,"My App CREATE", Toast.LENGTH_LONG).show();

        // UI 요소 객체 가져오기
        JoinEvent = (LinearLayout)findViewById(R.id.JoinEvent);
        JoinEvent.setBackgroundColor(Color.LTGRAY);

        titleinv = findViewById(R.id.titleinv);
    }

    // onClick 속성 지원 Method -----------------------
    // UI 요소 중 onClick 속성 설정한 경우 실행되는 메서드
     /* public void clickFunc(View v){

        if (v.getId() == R.id.cancleBTN)
            Toast.makeText(MainActivity.this,"CANCLE~", Toast.LENGTH_LONG).show();
        else if (v.getId() == R.id.okBTN)
            Toast.makeText(MainActivity.this,"onClick~", Toast.LENGTH_LONG).show();

    }
    */
        //버튼 클릭 시 배경화면 색 변경
    public void clickColFunc(View v){

        if (v.getId() == R.id.buttonEvent1) {
            JoinEvent.setBackgroundColor(Color.YELLOW);
            titleinv.setVisibility((View.INVISIBLE));

        }else if (v.getId() == R.id.buttonEvent2) {
            JoinEvent.setBackgroundColor(Color.rgb(random.nextInt(255),
                    random.nextInt(255),
                    random.nextInt(255)));
            titleinv.setVisibility(View.VISIBLE);

        }else if (v.getId() == R.id.titleTXT) {
            Log.i(TAG, "A GoOd DaY");
        }

        }
}