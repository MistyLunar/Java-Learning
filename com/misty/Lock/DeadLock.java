package com.misty.Lock;

public class DeadLock extends Thread{
    public static Object o1 = new Object();
    public static Object o2 = new Object();
    public boolean flag = true;

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("o1");
                synchronized (o2) {
                    System.out.println("o2");
                }
            }
        } else {
            synchronized (o2) {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("o2");
                synchronized (o1) {
                    System.out.println("o1");
                }
            }
        }
    }
}
