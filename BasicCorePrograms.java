import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number : ");
        int secondNumber = scan.nextInt();
        swapTwoNumbers(firstNumber, secondNumber);
    }

    public static void swapTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("Before swap ");
        System.out.println("first number : " + firstNumber);
        System.out.println("second number : " + secondNumber);
        int temNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temNumber;
        System.out.println("After swap ");
        System.out.println("first number : " + firstNumber);
        System.out.println("second number : " + secondNumber);
    }
}

