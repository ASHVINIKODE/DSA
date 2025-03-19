public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = { 22, 56, 32, 65, 78, 543, 23, 8954, 76, 4323, 98, 453, 33 };
        findMinMax(arr);

    }

    static void findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is Empty");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        System.out.println("Minimum:" + min);
        System.out.println("Maximum:" + max);
    }
}
