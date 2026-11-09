package com.misty.string;

public class TestString5 {
    public static void main(String[] args){
        String s = "advb-euy-kjk-iii";
        String[] arr = s.split("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
