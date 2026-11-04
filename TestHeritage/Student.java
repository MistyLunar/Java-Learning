package TestHeritage;

public class Student extends Person{
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void info() {
        //超类、基类
        //super.info();
        System.out.println("Name: " + this.getName() + "  Age: " + super.getAge() + "  School: " + this.getSchool());
    }
}
