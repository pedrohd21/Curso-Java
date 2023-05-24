package app;

import java.util.Locale;

import java.util.Scanner;

import util.Banco;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Enter account number: ");
		String conta = sc.nextLine();

		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.nextLine().charAt(0);
		if (response == 'y'){
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			banco = new Banco(conta, nome, initialDeposit);
		}
		else{
			banco = new Banco(conta, nome);
		}

		System.out.println("");
		System.out.println("Account data:");
		System.out.print(banco);

		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double valor = sc.nextDouble();
		banco.deposito(valor);
		System.out.print(banco);

		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		banco.saque(valor);
		System.out.print(banco);

		sc.close();
	}

}
