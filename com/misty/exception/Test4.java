package com.misty.exception;

public class Test4 {
    public static void main(String[] args) {
        try {
            fun(3, 5);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fun(int a, int b) throws MyException {
        if (a < b) {
            throw new MyException("逗你玩");
        }
    }
}
