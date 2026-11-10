package com.misty.stringBuffer;

public class TestBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append(123);
        sb.append("abc");
        sb.append(3.14);
        sb.append(true);
        System.out.println(sb);
        String s = sb.toString();
        s = String.valueOf(s);
    }
}
