package ma.projet.ex6;

public class Ex6 {
    public static int sommeMaximale(int[] tab) {
        int sommeActuelle = 0;
        int sommeMax = Integer.MIN_VALUE;

        for (int i = 0; i < tab.length; i++) {
            sommeActuelle += tab[i];
            if (sommeActuelle > sommeMax) {
                sommeMax = sommeActuelle;
            }
            if (sommeActuelle < 0) {
                sommeActuelle = 0;
            }
        }

        return sommeMax;
    }

    public static void main(String[] args) {
        int[] tab = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int resultat = sommeMaximale(tab);
        System.out.println("La somme maximale est : " + resultat);
    }
}
