package app;

import java.util.Locale;
import java.util.Scanner;

import util.Banco2;

public class Version2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Banco2 banco;
		
		System.out.print("Digite o numero da conta: ");
		String numero = sc.nextLine();
		
		System.out.print("Digite o nome usuario: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial? (y/n): ");
		char verificar = sc.nextLine().charAt(0);
		
		if (verificar == 'y') {
			System.out.print("Digite o valor para deposito: R$");
			double depositoInicial = sc.nextDouble();
			banco = new Banco2(numero, nome, depositoInicial); 
			System.out.println();
		}
		else {
			banco = new Banco2(numero, nome);
			System.out.println();
		}
		
		System.out.println(banco);
		System.out.print("Digite o valor deposito: R$");
		double deposito = sc.nextDouble();
		banco.deposito(deposito);
		System.out.println();
		
		System.out.println("Valores atualizados");
		System.out.println(banco);
		System.out.println();
		
		System.out.print("Digite o valor para sacar: R$");
		deposito = sc.nextDouble();
		banco.saque(deposito);
		System.out.println();
		
		System.out.println("Valores atualizados");
		System.out.println(banco);
		
		sc.close();
	}

}
