package Inheritence;

public class Professor extends UniversityMember {
    private String department;

    public Professor(String name, int age, String id, String department) {
        super(name, age, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
