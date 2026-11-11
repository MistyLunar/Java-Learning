package com.misty.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
    public static void main() {
        List list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add(123);
        list.add(3.14);
        list.add('夜');
        list.add(new Person(19,"Lunar"));
        list.add(new Person(19,"Misty"));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o );
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
