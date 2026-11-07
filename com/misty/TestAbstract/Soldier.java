package com.misty.TestAbstract;

public class Soldier {
    public void killEnemy(Weapon w){
        System.out.println("士兵上战场杀敌");
        w.attack();
    }
}
