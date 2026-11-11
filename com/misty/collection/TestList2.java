package com.misty.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList2 {
    public static void main() {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(21, "Soft"));
        list.add(new Person(20, "orbit"));
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
