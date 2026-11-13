package com.misty.ThreadTicket;

public class TicketWindow extends Thread{
    static int ticketNo = 1;
    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            if (ticketNo <= 10) {
                System.out.println(this.getName() + "已售卖编号为" + (ticketNo++) + "的票");
            }
        }
    }
}
