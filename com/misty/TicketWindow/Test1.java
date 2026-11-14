package com.misty.TicketWindow;

public class Test1 {
    public static void main() {
        TicketWindow1 tw = new TicketWindow1();
        Thread t1 = new Thread(tw);
        Thread t2 = new Thread(tw);
        Thread t3 = new Thread(tw);
        t1.setName("1号窗口");
        t2.setName("2号窗口");
        t3.setName("3号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
