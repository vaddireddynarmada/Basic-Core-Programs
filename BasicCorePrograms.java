import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter below 31 numbers ");
        int num = scan.nextInt();
        powerOf2(num);
    }

    public static void powerOf2(int num) {
        int result=0;
        if (num >= 0 && num < 31) {
            int value = (int) Math.pow(2, num);
            for (int i = 1; i <= num; i++) {
                result=(int) (Math.pow(2, i));
            }
            System.out.println("2 Power "+num+ " is : "+result);
        } else {
            System.out.println("number is not between 0 to 30 ");
        }
    }
}
