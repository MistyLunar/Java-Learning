package com.misty.ThreadCommunication;

public class Producer extends Thread {
    private Container container;

    public Producer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            container.pushHam(new Hambuger(i));
            System.out.println("生产者制做了" + i + "号汉堡");
        }
    }
}
