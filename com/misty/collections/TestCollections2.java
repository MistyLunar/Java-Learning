package com.misty.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections2 {
    public static void main() {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Misty", 17));
        list.add(new Person("Lunar", 19));
        list.add(new Person("Soft", 20));
        list.add(new Person("Orbit", 26));
        list.add(new Person("Orbit", 29));
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
