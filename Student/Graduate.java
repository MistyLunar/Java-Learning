package Student;

public class Graduate extends Student{
    private String degree;

    public Graduate(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public void info() {
        System.out.println("Name: " + this.getName() + " Age: " + this.getAge() + " degree: " + getDegree());
    }
}
