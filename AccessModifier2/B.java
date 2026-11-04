package AccessModifier2;

import AccessModifier.A;

public class B extends A{
    public void fun(){
        //不同包下的子类，无法访问private和default的内容
        this.c = 3;
        this.d = 4;
    }
}
