package com.misty.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestTransform {
    public static void main() {
        /*
        Scanner sc = new Scanner(System.in);
        sc.next();
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            System.out.println("接收的内容是：" + s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
