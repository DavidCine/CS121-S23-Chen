public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String major;
    private double gpa;

    public Student(int id, String firstName, String lastName, String major, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }
}