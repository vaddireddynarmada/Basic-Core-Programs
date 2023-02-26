import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        quadratic(a, b, c);
    }

    public static void quadratic(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        System.out.println("The roots are:" + delta);
        if (delta >= 0.0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else {
            double r1 = (-b + Math.sqrt(-delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(-delta)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
    }
}
