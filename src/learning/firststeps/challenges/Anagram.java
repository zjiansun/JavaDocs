package learning.firststeps.challenges;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        first = first.toLowerCase();
        char[] firstWord = first.toCharArray(); //convert into array of its characters
        String second = sc.nextLine();
        second = second.toLowerCase();
        char[] secondWord = second.toCharArray();

        Arrays.sort(firstWord); //sort in alphabetical order
        Arrays.sort(secondWord); //^^
        System.out.println(Arrays.equals(firstWord, secondWord));

    }
}
