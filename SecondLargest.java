public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99, 23 };
        int secondLargest = FindSecondLargest(arr);
        System.out.println("Second Largest number is:" + secondLargest);
    }

    static int FindSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
