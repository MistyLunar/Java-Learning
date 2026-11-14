package com.misty.TicketWindow;

public class TicketWindow1 implements Runnable{
    int ticketNo = 1;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (this) {
                if (ticketNo <= 10) {
                    System.out.println(Thread.currentThread().getName() + "已售卖编号为" + (ticketNo++) + "的票");
                }
            }
        }
    }
}
