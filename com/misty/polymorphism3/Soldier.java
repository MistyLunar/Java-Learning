package com.misty.polymorphism3;

public class Soldier {
    public void killEnemy(Weapon w){
        System.out.println("士兵上战场杀敌");
        w.attack();
    }
}
