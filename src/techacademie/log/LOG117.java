package techacademie.log;
import java.util.Scanner;

public class LOG117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input; //double pour permettre les chiffres décimaux

        do{
            System.out.println("Entrez votre chiffre");
            input = sc.nextDouble();
        }
        while(!checkNum(input));

    }

    static boolean checkNum(double i){
        return i >= Math.pow(11.5, 2);
    }
}
