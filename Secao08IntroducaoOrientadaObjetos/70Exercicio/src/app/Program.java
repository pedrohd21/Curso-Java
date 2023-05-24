package app;

import java.util.Locale;
import java.util.Scanner;

import util.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo();

		System.out.println("Digite os valores do retangulo: ");
		System.out.println("Largura: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Altura: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Area: " + retangulo.area());
		System.out.println("Perimetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		sc.close();
	}

}
