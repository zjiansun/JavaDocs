package challenges.ccc.j2022;
import java.util.Scanner;

//Cupcakes
public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int regular = sc.nextInt();
        int small = sc.nextInt();
        System.out.println(regular*8+small*3-28);
    }
}
