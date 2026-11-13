package com.misty.ThreadTicket;

import com.misty.Thread.MyThread;

public class Test3 {
    public static void main() {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Main: " + i);
        }
    }
}
