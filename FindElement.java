public class FindElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int target = 60;
        int index = searchElement(arr, target);
        System.out.println("Index:" + index);
    }

    static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
