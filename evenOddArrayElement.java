public class evenOddArrayElement {
    public static void main(String[] args) {
        int[] arr = { 22, 54, 53, 56, 23, 41, 23, 75 };
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
