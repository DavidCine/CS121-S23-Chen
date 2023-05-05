import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StudentReader {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("students.json")));
            JSONObject studentJson = new JSONObject(content);

            int id = studentJson.getInt("id");
            String firstName = studentJson.getString("firstName");
            String lastName = studentJson.getString("lastName");
            String major = studentJson.getString("major");
            double gpa = studentJson.getDouble("gpa");

            Student student = new Student(id, firstName, lastName, major, gpa);
            System.out.println("Student ID: " + student.getId());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Major: " + student.getMajor());
            System.out.println("GPA: " + student.getGpa());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}