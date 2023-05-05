public class Main {
    public static void main(String[] args) {
        // Create 2 instances of the Student class
        Student student1 = new Student("Bobby", "Smith", "1234", "Computer Science", "Sophomore");
        Student student2 = new Student("Timmy", "Johnson", "5678", "English", "Junior");

        // Add 3 or 4 courses to each student's course list
        student1.addCourse("Data Structures");
        student1.addCourse("Algorithms");
        student1.addCourse("Database Systems");
        student1.addCourse("Operating Systems");

        student2.addCourse("Creative Writing");
        student2.addCourse("British Literature");
        student2.addCourse("Shakespeare");
        student2.addCourse("Poetry");

        // Print each student's info and course list
        System.out.println("Student 1 Info:");
        System.out.println(student1.getStudentInfo());
        student1.displayStudentCourses();

        System.out.println("\nStudent 2 Info:");
        System.out.println(student2.getStudentInfo());
        student2.displayStudentCourses();

        // Remove 1 course from each student's course list
        student1.removeCourse("Database Systems");
        student2.removeCourse("Poetry");

        // Print each student's updated course list
        System.out.println("\nStudent 1 Course List After Removing 1 Course:");
        student1.displayStudentCourses();

        System.out.println("\nStudent 2 Course List After Removing 1 Course:");
        student2.displayStudentCourses();
    }
}