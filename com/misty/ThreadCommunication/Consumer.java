package com.misty.ThreadCommunication;

public class Consumer extends Thread {
    private Container container;

    public Consumer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            Hambuger h = container.popHam();
            System.out.println("消费者吃了第" + h.getId() + "号汉堡");

        }
    }
}
