import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter dividend : ");
        int dividend = scan.nextInt();
        System.out.println("enter divisor : ");
        int divisor = scan.nextInt();
        quotientRemainder(dividend, divisor);
    }

    public static void quotientRemainder(double dividend, double divisor) {
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
    }
}

