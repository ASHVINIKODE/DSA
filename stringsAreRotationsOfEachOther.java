import java.util.Scanner;

public class stringsAreRotationsOfEachOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st string:");
        String str1 = scan.nextLine();
        System.out.println("Enter the 2nd string:");
        String str2 = scan.nextLine();
        if (isRotation(str1, str2)) {
            System.out.println("Strings are rotation of each other!");
        } else {
            System.out.println("Strings are not rotation of each other!");
        }

    }

    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        return temp.contains(s2);
    }
}
