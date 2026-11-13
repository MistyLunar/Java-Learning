package com.misty.Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyThread " + i);
        }
    }
}
