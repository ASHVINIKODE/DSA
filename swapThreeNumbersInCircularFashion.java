import java.util.Scanner;

public class swapThreeNumbersInCircularFashion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Before swapping");
        System.out.println();
        System.out.println("Enter the value of a:");
        int a = scan.nextInt();
        System.out.println("Enter the value of a:");
        int b = scan.nextInt();
        System.out.println("Enter the value of a:");
        int c = scan.nextInt();
        System.out.println("-----------------------------------------");
        int temp;
        temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
    }
}
