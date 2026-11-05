package com.misty.casting;

public class Test {
    public static void main(String[] args){
        //父类引用指向子类对象
        //向上转型
        Person p = new Student();
        p.setAge(18);
        p.setName("Misty");

        //向下转型
        Student s = (Student) p;
        s.setSchool("BJTU");
    }
}
