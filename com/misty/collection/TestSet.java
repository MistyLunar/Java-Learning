package com.misty.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main() {
        Set set = new HashSet();
        set.add("hello");
        set.add("hello");
        set.add(123);
        set.add(3.14);
        set.add('月');
        set.add(new Person(18, "Misty"));
        set.add(new Person(18, "Misty"));
        System.out.println(set);
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            System.out.println(obj);
        }
    }
}
