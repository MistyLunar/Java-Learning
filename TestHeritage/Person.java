package TestHeritage;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + name + "  Age: " + age);
    }
}
