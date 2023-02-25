import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = scan.nextInt();
        factors(num);
    }

    public static void factors(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                number = number / i;
                System.out.println(number);
            }
            else {
                System.out.println("Number is not prime");
            }
        }
    }
}

