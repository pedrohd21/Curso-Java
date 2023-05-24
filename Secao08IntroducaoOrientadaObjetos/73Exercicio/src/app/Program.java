package app;

import java.util.Locale;
import java.util.Scanner;

import util.Moeda;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Moeda moeda = new Moeda();
		
		System.out.print("Valor do dola atual: ");
		moeda.dolar = sc.nextDouble();
		
		System.out.print("Valor dolar para converter: ");
		moeda.real = sc.nextDouble();
		
		System.out.print(moeda);
	}

}
