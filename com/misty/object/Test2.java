package com.misty.object;

public class Test2 {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.setName("小黄狗");
        a1.setAge(1);

        Animal a2 = new Animal();
        a2.setName("小黄狗");
        a2.setAge(1);

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
