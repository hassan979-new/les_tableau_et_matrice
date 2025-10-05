package ma.project.Ex5;

public class Ex5 {
    public static boolean estPermutationCirculaire(int[] tab, int n) {
        boolean[] vu = new boolean[n + 1];
        for (int val : tab) {
            if (val < 1 || val > n || vu[val]) {
                return false;
            }
            vu[val] = true;
        }

        int indiceUn = -1;
        for (int i = 0; i < n; i++) {
            if (tab[i] == 1) {
                indiceUn = i;
                break;
            }
        }

        int[] croissant = new int[n];
        int[] decroissant = new int[n];
        for (int i = 0; i < n; i++) {
            croissant[i] = i + 1;
            decroissant[i] = n - i;
        }

        for (int decalage = 0; decalage < n; decalage++) {
            boolean okCroissant = true;
            boolean okDecroissant = true;
            for (int i = 0; i < n; i++) {
                if (tab[i] != croissant[(i + decalage) % n]) {
                    okCroissant = false;
                }
                if (tab[i] != decroissant[(i + decalage) % n]) {
                    okDecroissant = false;
                }
            }
            if (okCroissant || okDecroissant) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] tab = {2, 1, 5, 4, 3};
        int n = tab.length;

        if (estPermutationCirculaire(tab, n)) {
            System.out.println("✅ C'est une permutation circulaire valide.");
        } else {
            System.out.println("❌ Ce n'est pas une permutation circulaire.");
        }
    }
}
