package AccessModifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //同一个包下不同类，无法访问private修饰的内容
        a.b = 1;
        a.c = 2;
        a.d = 3;
    }
}
