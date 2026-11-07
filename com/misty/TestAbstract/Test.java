package com.misty.TestAbstract;

public class Test {
    public static void main(String[] args){
        Soldier s = new Soldier();
        AK47 ak47 = new AK47();
        M4A1 m4a1 = new M4A1();
        Knife knife = new Knife();
        s.killEnemy(ak47);
        s.killEnemy(m4a1);
        s.killEnemy(knife);
    }
}
