package ma.projet.ex10;

public class Ex10 {
    public static boolean estCarreMagique(int[][] m) {
        int somme = 0;
        for (int j = 0; j < 3; j++) {
            somme += m[0][j];
        }

        for (int i = 1; i < 3; i++) {
            int ligne = 0;
            for (int j = 0; j < 3; j++) {
                ligne += m[i][j];
            }
            if (ligne != somme) return false;
        }

        for (int j = 0; j < 3; j++) {
            int colonne = 0;
            for (int i = 0; i < 3; i++) {
                colonne += m[i][j];
            }
            if (colonne != somme) return false;
        }

        int diag1 = m[0][0] + m[1][1] + m[2][2];
        int diag2 = m[0][2] + m[1][1] + m[2][0];

        if (diag1 != somme || diag2 != somme) return false;

        return true;
    }

    public static void main(String[] args) {
        int[][] matrice = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        if (estCarreMagique(matrice)) {
            System.out.println("La matrice est magique.");
        } else {
            System.out.println("La matrice n'est pas magique.");
        }
    }
}
