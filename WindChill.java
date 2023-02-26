import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter temperature above 50");
        int t = scan.nextInt();
        System.out.println("enter wind speed above 120 less than 3");
        int v = scan.nextInt();
        windChill(t,v);
    }
        public static void windChill(int t, int v) {
            if (t > 50 && v > 120 || v < 3) {
                double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
                System.out.println("wind chill : " + windChill);
            } else {
                System.out.println("The formula is not valid");
            }
        }
}
