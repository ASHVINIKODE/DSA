import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principle amount(initial investment)(P):");
        double P = scan.nextDouble();
        System.out.println("Enter the Annual interest rate (R) in decimal,(e.g.,5%=0.05):");
        double R = scan.nextDouble();
        System.out.println("Enter the number of times interest is compounded per year(n):");
        int n = scan.nextInt();
        System.out.println("Enter the time (in years)(T):");
        double T = scan.nextDouble();
        double A, CI;
        A = P * Math.pow(1 + (R / n), n * T);
        CI = A - P;
        System.out.println("compound interest=" + CI);
    }
}
