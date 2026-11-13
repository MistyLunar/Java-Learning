package com.misty.ThreadTicket;

import com.misty.Thread.MyThread;

public class Test2 {
    public static void main() {
        MyThread myThread = new MyThread();
        myThread.setPriority(10);
        myThread.start();
        for (int i = 0; i <= 30; i++) {
            System.out.println("Main" + i);
        }
    }
}
