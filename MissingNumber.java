import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = input.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9 };
        int ans = findMissingNumber(arr, n);
        System.out.println("Missing number is:" + ans);

    }

    static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
