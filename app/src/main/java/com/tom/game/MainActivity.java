package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
    }

    private void findView() {
        findViewById(R.id.button_down).setOnClickListener(this);
        findViewById(R.id.button_up).setOnClickListener(this);
        findViewById(R.id.button_right).setOnClickListener(this);
        findViewById(R.id.button_left).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_up:
                Log.d("MainActivity", "onClick_UP");
                break;
            case R.id.button_down:
                Log.d("MainActivity", "onClick_DOWN");
                break;
            case R.id.button_right:
                Log.d("MainActivity", "onClick_RIGHT");
                break;
            case R.id.button_left:
                Log.d("MainActivity", "onClick_LEFT");
                break;
        //為了區別是按了哪個button，所以用getId去得到每個button的id
        }

    }
}
