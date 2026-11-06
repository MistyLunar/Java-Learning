package com.misty.polymorphism;

public class Student extends Person{
    @Override
    public void speak() {
        System.out.println("I am a student.");
    }
}
