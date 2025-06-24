import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the String:");
        String word = scan.nextLine();
        word = word.toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
