import java.util.Scanner;

public class MethodsActivity {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);

        scanner.close();
    }

    // Get length from user
    public static double getLength() {
        System.out.print("Enter the length of the rectangle: ");
        return scanner.nextDouble();
    }

    // Get width from user
    public static double getWidth() {
        System.out.print("Enter the width of the rectangle: ");
        return scanner.nextDouble();
    }

    // Calculate area of the rectangle
    public static double getArea(double length, double width) {
        return length * width;
    }

    // Display data
    public static void displayData(double length, double width, double area) {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}
