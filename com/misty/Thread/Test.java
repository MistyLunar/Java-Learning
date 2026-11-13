package com.misty.Thread;

public class Test {
    public static void main() {
        //创建自定义的线程类对象
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        //启动子现场
        myThread.start();
        Thread.currentThread().setName("Main");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

        //匿名内部类
        Thread t = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        t.start();
    }
}
