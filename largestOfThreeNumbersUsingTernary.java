import java.util.Scanner;

public class largestOfThreeNumbersUsingTernary {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = Scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = Scan.nextInt();
        System.out.println("Enter the third number:");
        int num3 = Scan.nextInt();
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("The lasrgest of three number is:" + largest);
    }
}
