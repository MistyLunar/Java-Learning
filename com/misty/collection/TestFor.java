package com.misty.collection;

public class TestFor {
    public static void main() {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //增强for循环
        for (int value : a){
            System.out.println(value);
        }
    }
}
