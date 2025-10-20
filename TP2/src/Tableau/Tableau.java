package Tableau;

import java.util.Scanner;

public class Tableau {

	public static void pivots(int[] t, int n) {
		int[] pivots = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
		    int test = 1;
		    for (int j = 0; j < i; j++) {
		        if (t[j] > t[i]) { test = 0; break; }
		    }
		    for (int j = i+1; j < n; j++) {
		        if (t[j] < t[i]) { test = 0; break; }
		    }
		    if (test == 1) pivots[count++] = t[i];
		}

		System.out.println("Pivots sont: ");

		for (int i = 0; i < count; i++) {
			System.out.println(pivots[i]);

		}

	}

	public static int lis(int[] t, int n) {
		int[] dp = new int[n];
		int max = 1;

		for (int i = 0; i < n; i++) {
			dp[i] = 1; 
			for (int j = 0; j < i; j++) {
				if (t[i] > t[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			max = Math.max(max, dp[i]);
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("donner moi la taille (<=1000");

		int n = sc.nextInt();

		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("donner le numero " + (i + 1) + " : ");
			t[i] = sc.nextInt();
		}

		System.out.println("la langeur le plus longue est : " + lis(t, n));

		pivots(t, n);

		sc.close();
	}
}
