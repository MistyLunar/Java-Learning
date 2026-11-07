package com.misty.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test2 {
    public static void main(String[] args){
        try {
            InputStream in = new FileInputStream("com/misty/exception/abc.txt");
            Class.forName("com.misty.exception.Test2");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("最后一定要执行的内容");
        }
        System.out.println("Hello World");
    }
}
