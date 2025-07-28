public class maxMinElement {
    public static void main(String[] args) {
        int[] arr = { 22, 45, 21, 32, 11, 45, 75, 35, 76, 54, 79 };
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Max: " + max + ", Min: " + min);

    }
}
