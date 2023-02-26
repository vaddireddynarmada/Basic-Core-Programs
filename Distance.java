import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x value ");
        int x = scan.nextInt();
        System.out.println("enter y value ");
        int y = scan.nextInt();
        distance(x, y);
    }

    public static void distance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance of " + x + ", " + y + " is : " + distance);
    }
}
