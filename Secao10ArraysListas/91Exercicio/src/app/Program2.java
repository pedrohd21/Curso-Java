package app;

import java.util.Scanner;

import util.Internato2;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos hospedes: ");
		int n = sc.nextInt();
		Internato2[] vect = new Internato2[10];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Numero quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Internato2(nome, email, quarto);
		}
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("Quarto %d: %s%n", i, vect[i]);
			}
		}
		
	}

}
