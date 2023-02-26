import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int noOfRows = scan.nextInt();
        System.out.println("Enter the number of columns : ");
        int noOfCols = scan.nextInt();
        twoDArray(noOfRows,noOfCols);
    }

    public static void twoDArray(int noOfRows, int noOfCols) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[noOfRows][noOfCols];
        int noOfElements = noOfRows * noOfCols;
        System.out.println("Please enter " + noOfElements + " elements");
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The Input array is :");
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


