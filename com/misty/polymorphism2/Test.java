package com.misty.polymorphism2;

public class Test {
    public static void main(String[] args){
        Person p = new Person();
        Dog d = new Dog();
        Cat c = new Cat();
        Mouse m = new Mouse();
        p.catchAnimal(d);
        p.catchAnimal(c);
        p.catchAnimal(m);
    }
}
