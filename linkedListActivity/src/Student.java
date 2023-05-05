import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private String ID;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;

    public Student(String firstName, String lastName, String ID, String major, String classStanding) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = 0.0;
        this.courseList = new LinkedList<>();
    }

    public void addCourse(String courseName) {
        courseList.add(courseName);
    }

    public void removeCourse(String courseName) {
        courseList.remove(courseName);
    }

    public String getStudentInfo() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "ID: " + ID + "\n" +
                "Major: " + major + "\n" +
                "Class Standing: " + classStanding + "\n" +
                "GPA: " + gpa;
    }

    public void displayStudentCourses() {
        System.out.println("Course List:");
        for (String course : courseList) {
            System.out.println(course);
        }
    }
}