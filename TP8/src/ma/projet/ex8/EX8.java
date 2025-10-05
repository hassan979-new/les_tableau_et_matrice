package ma.projet.ex8;

public class EX8 {
    public static void afficherManquants(int[] tab) {
        int max = 0;
        for (int val : tab) {
            if (val > max) {
                max = val;
            }
        }

        boolean[] vu = new boolean[max + 1];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 1 && tab[i] <= max) {
                vu[tab[i]] = true;
            }
        }

        System.out.print("Nombres manquants : ");
        for (int i = 1; i <= max; i++) {
            if (!vu[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] tab = {1, 3, 3, 6, 10};
        afficherManquants(tab);
    }
}
