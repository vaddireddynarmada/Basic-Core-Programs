import java.util.Random;
import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter positive number");
        int numOfFlips = scan.nextInt();
        flipCoin(numOfFlips);
    }

    public static void flipCoin(int numOfFlips) {
        int heads = 0;
        int tails = 0;
        if (numOfFlips > 0) {
            for (int i = 1; i <= numOfFlips; i++) {
                Random r = new Random();
                int chance = r.nextInt(2);
                if (chance > 0.5) {
                    tails++;
                } else {
                    heads++;
                }
            }
            double percentOfHeads = heads * 100 / numOfFlips;
            double percentOfTails = tails * 100 / numOfFlips;
            System.out.println("percentOfHeads : " + percentOfHeads);
            System.out.println("percentOfTails : " + percentOfTails);
        } else {
            System.out.println("enter positive number for coin flip");
        }
    }
}
