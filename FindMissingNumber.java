public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int missing = findMissing(arr, 9);
        System.out.println("missing number:" + missing);
    }

    static int findMissing(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];
        for (int num : arr) {
            present[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return -1;
    }
}
