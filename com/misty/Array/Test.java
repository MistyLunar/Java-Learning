package com.misty.Array;

public class Test {
    public static void main(String[] args) {
        //int[] a = new int[5];
        /*int[] a = new int[]{123,456,789};
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        Person[] ps = new Person[3];
        ps[0] = new Person("张三", 18);
        ps[1] = new Person("李四", 23);
        ps[2] = new Person("王五", 20);
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i]);
        }
    }
}
