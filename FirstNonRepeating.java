//first non repeating
public class FirstNonRepeating {
    public static int findNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 0, 4 };
        System.out.println(findNonRepeating(arr));
    }
}
