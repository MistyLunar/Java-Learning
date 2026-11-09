package com.misty.string;

import java.util.Locale;

public class TestString3 {
    public static void main(String[] args) {
        String s1 = "how have you been?";
        String s2 = "HOW HAVE YOU BEEN?";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        String varifyCode = "4NVQ";
        String myCode = "4nvq";
        varifyCode.equals(myCode.toUpperCase());
        System.out.println(varifyCode.equalsIgnoreCase(myCode));
        System.out.println(s1.startsWith("how"));
        System.out.println(s2.endsWith("?"));
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.indexOf("z"));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(4, 10));

        String myFileName = "abc.zip";
        String extName = myFileName.substring(myFileName.lastIndexOf(".") + 1);

        if (extName.equalsIgnoreCase("jpg") || extName.equalsIgnoreCase("png") || extName.equalsIgnoreCase("bmp")) {
            System.out.println("输入正确");
        }else{
            System.out.println("文件格式错误");
        }
    }
}
