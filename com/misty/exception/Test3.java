package com.misty.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test3 {
    public static void main(String[] args){
        try {
            fun1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fun1() throws FileNotFoundException {
        fun2();
    }

    public static void fun2() throws FileNotFoundException {
        fun3();
    }

    public static void fun3() throws FileNotFoundException {
        InputStream in = new FileInputStream("abc");
    }

}
