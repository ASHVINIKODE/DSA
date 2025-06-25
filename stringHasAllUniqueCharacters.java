import java.util.Scanner;

public class stringHasAllUniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scan.nextLine();
        if (hasUnique(str)) {
            System.out.println("String has all unique characters!");
        } else {
            System.out.println("String has duplicate characters!");
        }

    }

    static boolean hasUnique(String str) {
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (seen[ch])
                return false;
            seen[ch] = true;
        }
        return true;
    }
}
