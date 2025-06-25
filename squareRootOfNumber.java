import java.util.Scanner;

public class squareRootOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = scan.nextDouble();
        double sqrt = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + sqrt);
    }
}
