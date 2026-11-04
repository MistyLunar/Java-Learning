package Student;

public class UnderGraduate extends Student{
    private String major;

    public UnderGraduate(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void info() {
        System.out.println("Name: " + this.getName() + " Age: " + this.getAge() + " Major: " + getMajor());
    }
}
