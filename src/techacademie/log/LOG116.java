package techacademie.log;
import java.util.Scanner;

public class LOG116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre d'étages:");
        int n = sc.nextInt(); //nombre d'étages

        System.out.println("Affichage de la pyramide à " + n + " étages");
        for(int i=1;i<=n;i++){ //boucle pour les étages
            for(int j=1;j<=i;j++){ //boucle pour print les 'a'
                System.out.print("a");
            }
            System.out.println(); //pour passer à la prochaine ligne
        }
    }
}
