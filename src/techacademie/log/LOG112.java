package techacademie.log;

public class LOG112 {
    public static void main(String[] args) throws Exception {
        final String prenom = "Jian Sun";
        int age =  14;
        double poidsKg = 72.5;
        boolean estGrand = true;
        int resultat1 = 4*3;
        double resultat2 = (double) 5/3;
        int resultat3 = 9%2;

        System.out.println(prenom+" a "+age+" ans et pèse "+poidsKg+" kg.");
        System.out.println("Est-ce que "+prenom+" est grand ? "+estGrand);
        System.out.println("4*3 = "+resultat1);
        System.out.println("5/3 = "+resultat2);
        System.out.println("9%2 = "+resultat3);
    }
}
