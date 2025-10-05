package ma.projet.ex7;

public class Ex7 {
    public static int elementMajoritaire(int[] tab) {
        int n = tab.length;

        for (int i = 0; i < n; i++) {
            int compteur = 0;
            for (int j = 0; j < n; j++) {
                if (tab[j] == tab[i]) {
                    compteur++;
                }
            }
            if (compteur > n / 2) {
                return tab[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] tab = {3, 1, 3, 3, 2}; 
        int resultat = elementMajoritaire(tab);
        System.out.println("✅ Élément majoritaire : " + resultat);
    }
}
