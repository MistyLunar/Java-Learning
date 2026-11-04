package Person;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("张三");
        p2.setName("张三");
        System.out.println(Person.count);
    }
}