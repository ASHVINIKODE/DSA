import java.util.Scanner;

public class countNumberOfWordsInSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = scan.nextLine();
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Number of words in the sentence:" + words.length);

    }
}
