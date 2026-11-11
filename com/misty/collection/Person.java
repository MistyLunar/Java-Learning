package com.misty.collection;

public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "  " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person)obj;
            if (this.name.equals(p.name) && this.age == p.age) {
                 return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
