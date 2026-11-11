package com.misty.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCollections1 {
    public static void main() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(25);
        list.add(45);
        list.add(65);
        list.add(15);
        //随机排列
        Collections.shuffle(list);
        System.out.println(list);
        //逆序排列
        Collections.reverse(list);
        System.out.println(list);
        //生序排列
        Collections.sort(list);
        System.out.println(list);

        List<String> list1 = new ArrayList<String>();
        list1.add("24");
        list1.add("56");
        list1.add("13");
        list1.add("87");
        list1.add("43");

        //随机排列
        Collections.shuffle(list1);
        System.out.println(list1);
        //逆序排列
        Collections.reverse(list1);
        System.out.println(list1);
        //生序排列
        Collections.sort(list1);
        System.out.println(list1 );
    }
}
