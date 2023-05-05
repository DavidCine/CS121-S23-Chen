import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        Student student = new Student(1, "John", "Doe", "Computer Science", 3.5);

        JSONObject studentJson = new JSONObject();
        studentJson.put("id", student.getId());
        studentJson.put("firstName", student.getFirstName());
        studentJson.put("lastName", student.getLastName());
        studentJson.put("major", student.getMajor());
        studentJson.put("gpa", student.getGpa());

        try (FileWriter file = new FileWriter("students.json")) {
            file.write(studentJson.toString());
            file.flush();
            System.out.println("Student data has been written to students.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}