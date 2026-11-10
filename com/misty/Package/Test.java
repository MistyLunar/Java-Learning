package com.misty.Package;

public class Test {
    public static void main() {
        Integer in = new Integer(5);
        Integer i = 5;//自动打包
        int a = new Integer(5);//自动解包

        String s = "123";
        int b = Integer.parseInt(s);
    }
}
