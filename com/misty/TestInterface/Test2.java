package com.misty.TestInterface;

public class Test2 {
    public static void main(String[] args){
        Gun g = new AK47();
        Weapon w = new AK47();
        g.shout();
        w.attack();
    }
}
