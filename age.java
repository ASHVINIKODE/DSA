import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scan.nextLine();
        System.out.println("Enter the age:");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println(name + " is " + age + " year old.(Not eligible to vote)");
        } else {
            System.out.println("eligible to vote");

        }
    }
}
