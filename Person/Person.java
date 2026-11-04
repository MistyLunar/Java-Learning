package Person;

public class Person {
    private String name;
    public static int count = 0;
    private int sex;

    public Person() {
        count++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
