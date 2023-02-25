import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number : ");
        int firstNumber = scan.nextInt();
        System.out.println("enter second number : ");
        int secondNumber = scan.nextInt();
        System.out.println("enter third number : ");
        int thirdNumber = scan.nextInt();
        largestOfNumbers(firstNumber, secondNumber, thirdNumber);
    }

    public static void largestOfNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is largest ");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number is largest ");
        } else if (secondNumber == firstNumber & secondNumber == thirdNumber) {
            System.out.println("Three number are equal ");
        } else {
            System.out.println("Third number is largest ");
        }
    }
}


