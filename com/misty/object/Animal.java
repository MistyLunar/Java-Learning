package com.misty.object;

public class Animal {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal){
            Animal a = (Animal) obj;
            if (this.getName().equals(a.getName()) && this.getAge() == a.getAge()){
                return true;
            }
        }
        return false;
    }
}
