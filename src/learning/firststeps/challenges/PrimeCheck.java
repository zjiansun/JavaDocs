package learning.firststeps.challenges;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factors = 0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors++;
            }
        }
        System.out.println(factors<=2);
    }
}
