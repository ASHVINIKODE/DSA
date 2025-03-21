import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of K:");
        int k = input.nextInt();
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        System.out.println(findKthSmallestElement(arr, k));
    }

    static int findKthSmallestElement(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
