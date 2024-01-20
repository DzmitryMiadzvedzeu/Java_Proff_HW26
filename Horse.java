package com.telran.org.homework_26;

import java.time.LocalTime;

public class Horse implements Runnable{

    private String name;
    private int step;

    public Horse(String name, int step) {
        this.name = name;
        this.step = step;
    }

    @Override
    public void run() {
        for (int i = 0; i <1001; i += step ){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Horse " + name + " just finished! time = " + LocalTime.now());
    }
}
