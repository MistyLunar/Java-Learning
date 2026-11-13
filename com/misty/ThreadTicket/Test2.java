package com.misty.ThreadTicket;

import com.misty.Thread.MyThread;

public class Test2 {
    public static void main() {
        MyThread myThread = new MyThread();
        for (int i = 0; i <= 30; i++) {
            if (i == 10) {
                myThread.start();
                try {
                    myThread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Main" + i);
        }
    }
}
