package learning.firststeps.challenges;
import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalWord = sc.nextLine();
        String[] originalWordArray = originalWord.split(" ");
        String reversedWord = "";

        for(int i=originalWordArray.length-1;i>=0;i--){
            reversedWord = reversedWord+=originalWordArray[i]+" ";
        }

        System.out.println(reversedWord);

    }
}
