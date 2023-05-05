package Inheritence;

public class Student extends UniversityMember {
    private String major;

    public Student(String name, int age, String id, String major) {
        super(name, age, id);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
