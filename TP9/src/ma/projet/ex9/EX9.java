package ma.projet.ex9;

public class EX9 {
	public static void sommeDiagonales(int[][] matrice) {
		int n = matrice.length;
		int sommePrincipale = 0;
		int sommeSecondaire = 0;

		for (int i = 0; i < n; i++) {
			sommePrincipale += matrice[i][i];
			sommeSecondaire += matrice[i][n - 1 - i];
		}

		int difference = Math.abs(sommePrincipale - sommeSecondaire);

		System.out.println("Somme diagonale principale : " + sommePrincipale);
		System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
		System.out.println("Différence absolue : " + difference);
	}

	public static void main(String[] args) {
		int[][] matrice = { { 1, 2, 4 }, { 4, 2, 6 }, { 0, 8, -1 } };

		sommeDiagonales(matrice);
	}
}
