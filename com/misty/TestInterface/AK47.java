package com.misty.TestInterface;

public class AK47 extends Weapon implements Gun{
    @Override
    public void attack() {
        System.out.println("使用AK攻击");
    }

    @Override
    public void shout() {
        System.out.println("压着点弹道，有点飘");
    }
}
