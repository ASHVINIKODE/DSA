public class generateRandomNumber {
    public static void main(String[] args) {
        int randomnum = (int) (Math.random() * 100) + 1;
        System.out.println("Random no. between 1 to 100:" + randomnum);
    }
}
