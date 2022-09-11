package learning.firststeps.challenges;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence of words");
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");

        System.out.println("Enter the position of the word you want to find");
        int pos = sc.nextInt();

        System.out.println("RESULT: "+ inputArray[pos-1]);

    }
}
