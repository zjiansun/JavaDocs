package learning.firststeps.challenges;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int length = String.valueOf(number).length(); //all digits have to be raised to this number
        int[] digits = intToArray(number); //int converted into an array with length of its digits
        int finalNum = 0;

        for (int digit : digits) {
            int a = (int) Math.pow(digit, length);
            finalNum += a;
        }

        System.out.println(finalNum == number);
    }

    //CREDITS: THIS METHOD IS FOUND HERE: https://www.quora.com/How-do-I-convert-int-to-int-array-of-digts
    static int[] intToArray(int n) {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0) {
            arr[len-j-1] = n%10;
            n=n/10;
            j++;
        }
        return arr;
    }
}
