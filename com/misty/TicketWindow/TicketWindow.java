package com.misty.TicketWindow;

public class TicketWindow extends Thread{
    static int ticketNo = 1;
    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            /*synchronized (TicketWindow.class) {
                if (ticketNo <= 10) {
                    System.out.println(this.getName() + "已售卖编号为" + (ticketNo++) + "的票");
                }
            }*/
            buyTicket();
        }
    }

    public static synchronized void buyTicket() {
        if (ticketNo <= 10) {
            System.out.println(Thread.currentThread().getName()+ "已售卖编号为" + (ticketNo++) + "的票");
        }
    }
}
