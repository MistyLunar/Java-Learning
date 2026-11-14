package com.misty.ThreadCommunication;

public class Container {
    private Hambuger[] hams = new Hambuger[5];
    private int index = 0;

    public synchronized void pushHam(Hambuger h) {
        if (index == hams.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notify();
        hams[index] = h;
        index++;
    }

    public synchronized Hambuger popHam() {
        if (index == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        index--;
        notify();
        return hams[index];
    }

}
