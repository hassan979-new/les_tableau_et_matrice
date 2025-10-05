package ex3;

import java.util.Iterator;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 System.out.println("donner les dimension: ");
		 int n = sc.nextInt();
		 
		 int[][] m = new int[n][n];
		 
		 int num=1;
		 
		 int top = 0;
		 int down = n-1;
		 int left = 0;
		 int right = n-1;
		 
		 while(num<= n*n) {
			for (int j = left; j <= right && num <= n * n; j++) {
				m[top][j]=num++;
			}
			top++;
			
			for (int j = top; j <= down && num <= n * n; j++) {
				m[j][right]=num++;
			}
			right--;
			
			for (int j = right; j >= left && num <= n * n; j--) {
				m[down][j]=num++;
			}
			down--;
			
			for (int j = down; j >= top && num <= n * n; j--) {
				m[j][left]=num++;
			}
			left++;
			
		}
		 
		 for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(m[i][j] + "\t");
	            }
	            System.out.println();
		 }
		 
	}

}
