package learning.firststeps;
import java.util.Scanner;

public class SumAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.print("Result: ");
        System.out.println(Integer.sum(a,b));
    }
}
