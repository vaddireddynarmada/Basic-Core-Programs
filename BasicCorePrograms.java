import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = scan.nextInt();
        harmonicNumber(num);
    }

    public static void harmonicNumber(int num) {
        double result = 0;
        if (num != 0) {
            for (int i = 1; i <= num; i++) {
                result = (double) 1 / i;
            }
            System.out.println("Nth Harmonic Value : " + result);
        } else {
            System.out.println("do not enter zero");
        }
    }
}

