package app;

import java.util.Locale;

import java.util.Scanner;

import util.Bola;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Cor bola: ");
		String cor = sc.nextLine();
		
		System.out.print("Tamanho: ");
		String tamanho = sc.nextLine();
		
		System.out.print("Material: ");
		String material = sc.nextLine();
		
		Bola bola = new Bola(cor, tamanho, material);
		
		System.out.println("Cor da Bola atual " + bola.mostrar_cor()); 
		
		System.out.print("Nova cor bola: ");
		String nova_cor = sc.nextLine();
		bola.trocar_cor(nova_cor);
		
		System.out.println("Cor da bola " + bola.mostrar_cor()); 
		
		sc.close();
		
	}

}
