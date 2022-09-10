package learning.firststeps;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = sc.nextLine();
        String rev = "";
        for(int i=0;i < str.length(); i++) {
            char charAtIndex = str.charAt(i);
            rev = charAtIndex + rev;
        }
        System.out.println(rev);
    }
}
