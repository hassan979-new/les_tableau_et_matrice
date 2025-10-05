package ma.project.ex4;

import java.util.Iterator;

public class Ex4 {
	
	public static int largeSurface(int[] t) {
		int maxSurface = 0;
		
		for (int i = 0; i < t.length; i++) {
			int minHeutheur = t[i];
			for (int j = 0; j < t.length; j++) {
				minHeutheur = Math.min(minHeutheur, t[j]);
				int surface = minHeutheur * (j-i+1);
				maxSurface = Math.max(maxSurface, surface);
			}
		}
		return maxSurface;
	}
	
	public static void main(String[] args) {
		int[][] m=  {{1, 0, 1, 1, 1},
	            	{1, 1, 1, 1, 1},
	            	{0, 1, 1, 1, 0}};
		
		int line = m.length;
		int cols = m[0].length;
		int [] histograme =new int[cols];
		
		int maxSurface = 0;
		
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < cols; j++) {
				if (m[i][j]==1) {
					histograme[j]++;
				}else {
					histograme[j]=0;
				}
				
				
			
			}
			int surface = largeSurface(histograme);
			maxSurface = Math.max(maxSurface, surface);
		}

		System.out.println("Max rectangle surface des 1 est: "+maxSurface);
	}
	
}
