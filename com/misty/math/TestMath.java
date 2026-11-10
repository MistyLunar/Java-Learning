package com.misty.math;

import java.util.Random;

public class TestMath {
    public static void main() {
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.6));
        System.out.println(Math.random());

        Random r = new Random();
        System.out.println(r.nextInt(100));

    }
}
