public class ElementsInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 10, 20, 30 };
        findRange(arr, 10, 25);
    }

    static void findRange(int[] arr, int low, int high) {
        for (int num : arr) {
            if (num >= low && num <= high) {
                System.out.println(num + " ");
            }
        }
    }
}
