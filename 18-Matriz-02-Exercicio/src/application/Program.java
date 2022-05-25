package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i<m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for (int i = 0; i<m; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j]==number) {
					System.out.println("Position: "+i +","+ j);
					if(i<1) {
				//linha 0 não possui valor acima
						System.out.println("Left: "+mat[i][j-1]);
						System.out.println("Right: "+mat[i][j+1]);
						System.out.println("Down: "+mat[i+1][j]);
					} 
					else if (i==m-1) {
				//última linha não possui valor a baixo
						System.out.println("Left: "+mat[i][j-1]);
						System.out.println("Right: "+mat[i][j+1]);
						System.out.println("Up: "+mat[i-1][j]);
					} else if (j<1) {
				//coluna 0 não possui valor a esquerda	
						System.out.println("Up: "+mat[i-1][j]);
						System.out.println("Right: "+mat[i][j+1]);
						System.out.println("Down: "+mat[i+1][j]);
					} else if (j==n-1) {
				//última coluna não possui valor a direita	
						System.out.println("Left: "+mat[i][j-1]);
						System.out.println("Up: "+mat[i-1][j]);
						System.out.println("Down: "+mat[i+1][j]);
					} else {
						System.out.println("Left: "+mat[i][j-1]);
						System.out.println("Right: "+mat[i][j+1]);
						System.out.println("Up: "+mat[i-1][j]);
						System.out.println("Down: "+mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
