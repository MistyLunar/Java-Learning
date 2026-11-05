package com.misty.object;
import java.util.Date;

public class Test {
    public static void main(String[] args){
        Animal a = new Animal();
        System.out.println(a);//输出哈希地址hashCode
        System.out.println(a.toString());

        String s = new String("hello");
        System.out.println(s);

        Date date = new Date();
        System.out.println(date);
    }
}
