package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameView gameView;

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
        gameView = findViewById(R.id.game);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity", "onClick_UP");
                //gameView.posY = gameView.posY-50;
                //gameView.posY-=50;
                gameView.setPosY(gameView.getPosY()-50);
                gameView.invalidate();
                break;
            case R.id.arrow_down:
                Log.d("MainActivity", "onClick_DOWN");
                //gameView.posY = gameView.posY+50;
                gameView.setPosY(gameView.getPosY()+50);
                gameView.invalidate();
                break;
            case R.id.arrow_right:
                Log.d("MainActivity", "onClick_RIGHT");
                //gameView.posX = gameView.posX+50;
                gameView.setPosX(gameView.getPosX()+50);
                gameView.invalidate();
                break;
            case R.id.arrow_left:
                Log.d("MainActivity", "onClick_LEFT");
                //gameView.posX = gameView.posX-50;
                gameView.setPosX(gameView.getPosX()-50);
                gameView.invalidate();
                break;
        //為了區別是按了哪個button，所以用getId去得到每個button的id
        }

    }
}
