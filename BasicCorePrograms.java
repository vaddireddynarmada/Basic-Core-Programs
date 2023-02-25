import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter year to check for leap year ");
        int year = scan.nextInt();
        leapYear(year);
    }

    public static void leapYear(int year) {
        if (year >= 1000 && year <= 9999) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        } else {
            System.out.println("enter 4 digit number");
        }
    }
}
