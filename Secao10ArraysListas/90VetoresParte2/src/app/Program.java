package app;

import java.util.Locale;
import java.util.Scanner;

import util.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPreco();
		}
		
		double media = sum / n;
		System.out.printf("Media preco: %.2f", media);
		sc.close();
	}

}
