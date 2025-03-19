public class FirstLastOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 1, 1, 4, 5, 6, 1 };
        int target = 4;
        findfirstlast(arr, target);
    }

    static void findfirstlast(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        }
    }
}
