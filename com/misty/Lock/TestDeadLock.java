package com.misty.Lock;

public class TestDeadLock {
    public static void main() {
        DeadLock d1 = new DeadLock();
        DeadLock d2 = new DeadLock();
        d1.flag = false;
        d1.start();
        d2.start();
    }
}
