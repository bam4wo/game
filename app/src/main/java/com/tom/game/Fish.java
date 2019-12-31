package com.tom.game;

public class Fish extends Thread{
    public static final int DIRECTION_RIGHT = 0;
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_UP = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_NONE = -1;
    private int direction = DIRECTION_NONE;
    private final GameView gameView;
    int x = 0;
    int y = 0;
    public Fish(GameView gameView) {
        this.gameView = gameView;
    }

    @Override
    public void run() {
        while (direction != DIRECTION_NONE){
            switch (direction){
                case DIRECTION_RIGHT:
                    if(x < gameView.getWidth()-200){
                        x-=50;
                    }
                    try {
                        sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                case DIRECTION_LEFT:
                    if (x > 50){

                    }
            }
        }
    }
}
