package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for (int c=0; c<mat[i].length; c++) {
				mat[i][c] = sc.nextInt();
			}
		}
		
		for (int i=0; i<mat.length; i++) {
			for (int c=0; c<mat[i].length; c++) {
				System.out.print(mat[i][c] + " ");
			}
			System.out.println();
		}
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int c=0; c<mat[i].length; c++) {
				if (x == mat[i][c]) {
					System.out.println("Position: " + i + ", " + c);
					System.out.println("left: " + mat[i][c-1]);
					System.out.println("Right: " + mat[i][c+1]);
					System.out.println("Down: " + mat[i+1][c]);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
