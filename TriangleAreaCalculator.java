import java.util.Scanner;

public class TriangleAreaCalculator {
    private double base;
    private double height;

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + calculateArea());
    }
http://meet.google.com/hzr-dszn-ywh 
    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.getUserInput();
        calculator.displayArea();
    }
}