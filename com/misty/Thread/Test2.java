package com.misty.Thread;

public class Test2 {
    public static void main() {
        MyThread2 myThread2 = new MyThread2();
        Thread t = new Thread(myThread2);
        t.setName("MyThread");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
