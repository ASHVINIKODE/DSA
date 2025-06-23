import java.util.Scanner;

public class simpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principle amount (initial money) (P): ");
        double P = scan.nextDouble();
        System.out.println("Enter the rate of interest per year (R): ");
        double R = scan.nextDouble();
        System.out.println("Enter the time (in years) (T): ");
        double T = scan.nextDouble();
        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest (SI):" + SI);

    }
}
