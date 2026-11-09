package com.misty.string;

public class TestString4 {
    public static void main(String[] args) {
        int i = 3;
        double b = 3.14;
        Person p = new Person(19,"Jack");
        String s1 = String.valueOf(i);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(p);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
