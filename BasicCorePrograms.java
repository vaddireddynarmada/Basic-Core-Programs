import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter elements ");
        int b = scan.nextInt();
        int[] a = new int[b];
        threeIntegerZero(b,a);
    }

    public static void threeIntegerZero(int b,int[] a) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < b; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int l = j + 1; l < a.length; l++) {
                    if (a[i] + a[j] + a[l] == 0) {
                        System.out.println("Found 3 elements whose sum is = 0");
                        System.out.println("Elements are " + a[i] + " " + a[j] + " " + a[l]);
                        return;
                    }
                }
            }
        }
        System.out.println("Did not find 3 elements whose sum is = 0");
    }
}


