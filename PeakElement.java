public class PeakElement {

    public static int findPeak(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                return arr[i];
        }
        return arr[0] > arr[1] ? arr[0] : arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 20, 4, 1, 0 };
        System.out.println(findPeak(arr)); 
    }

}
