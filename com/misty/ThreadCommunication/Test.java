package com.misty.ThreadCommunication;

public class Test {
    public static void main(String[] args) {
        Container container = new Container();
        Producer p = new Producer(container);
        Consumer c = new Consumer(container);
        p.start();
        c.start();
    }
}
