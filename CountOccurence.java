public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1, 1, 1, 3, 4, 5, 3, 4, 5, 9, 8, 9 };
        int target = 1;
        int count = countOccurence(arr, target);
        System.out.println("Target appears " + count + " times");
    }

    static int countOccurence(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
//count occurence
