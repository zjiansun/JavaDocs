package techacademie.log;
import java.util.Scanner;

public class LOG115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le rayon du cercle en centimètres");
        double rayon = sc.nextDouble(); //le rayon que l'utilisateur entrera
        int aire = (int) (Math.PI*Math.pow(rayon, 2)); // le calcul d'aire
        sc.close();

        //le boucle de logique
        if(aire<5){
            System.out.println("Ceci est un bien petit cercle!");
        }else if(aire>=5 && aire <=10){
            System.out.println("Un bien beau cercle de taille moyenne!");
        }else{
            System.out.println("Un très gros cercle!");
        }
    }
}
