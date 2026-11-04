package AccessModifier2;

public class Test {
    public static void main(String[] args){
        B b = new B();
        //无法访问private，default，protected
        b.d = 5;
    }
}
