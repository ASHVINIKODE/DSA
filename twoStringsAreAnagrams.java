import java.util.Arrays;
import java.util.Scanner;

public class twoStringsAreAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st string:");
        String str1 = scan.nextLine();
        System.out.println("Enter the 2nd string:");
        String str2 = scan.nextLine();
        if (areAnagram(str1, str2)) {
            System.out.println("Strings are Anagrams!");
        } else {
            System.out.println("Strings are not Anagrams!");
        }

    }

    static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
