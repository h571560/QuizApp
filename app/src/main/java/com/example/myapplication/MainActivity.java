package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showAll = (Button)findViewById(R.id.button1);
        Button addQuestion = (Button)findViewById(R.id.button2);
        Button startQuiz = (Button)findViewById(R.id.button3);
        Button howItWorks = (Button)findViewById(R.id.button4);
        showAll.setOnClickListener(this);
        addQuestion.setOnClickListener(this);
        startQuiz.setOnClickListener(this);
        howItWorks.setOnClickListener(this);
        hideNavBar();
        getWindow()
                .setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideNavBar();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                openActivityShowALl();
                break;
            case R.id.button2:
                openActiAddQuestion();
                break;
            case R.id.button3:
                openActivityStartQuiz();
                break;
            case R.id.button4:
                openActivityHowDoesItWork();
                break;

        }
    }

    public void openActivityShowALl(){
        Intent intent = new Intent(this, ActivityShowAll.class);
        startActivity(intent);
    }

    public void openActivityStartQuiz(){
        Intent intent = new Intent(this, ActivityStartQuiz.class);
        startActivity(intent);
    }
    public void openActivityHowDoesItWork(){
        Intent intent = new Intent(this, ActivityHowDoesItWork.class);
        startActivity(intent);
    }
    public void openActiAddQuestion(){
        Intent intent = new Intent(this, ActivityAddQuestion.class);
        startActivity(intent);
    }



    public void hideNavBar(){
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN|
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
                                View.SYSTEM_UI_FLAG_FULLSCREEN|
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }
}

