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
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity", "onClick_UP");
                break;
            case R.id.arrow_down:
                Log.d("MainActivity", "onClick_DOWN");
                break;
            case R.id.arrow_right:
                Log.d("MainActivity", "onClick_RIGHT");
                break;
            case R.id.arrow_left:
                Log.d("MainActivity", "onClick_LEFT");
                break;
        //為了區別是按了哪個button，所以用getId去得到每個button的id
        }

    }
}
