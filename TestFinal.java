public class TestFinal {
    public static void main(String[] args){
        final int a = 1;
        //final修饰的变量不能改变
        //a = 20;
    }
}

final class A{

}

//final修饰的类不能被继承
clash B extends A{

}

class AA{
    public final void fun(){

    }
}

class BB extends AA{
    //final修饰的方法不能被重写
    public void fun(){

    }
}
