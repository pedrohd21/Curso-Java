package app;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.ContaNegocios;
import entities.ContaPoupanca;

// classe abstrata nao pode ser instanciada

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "Alex", 500.0, 0.01));
		list.add(new ContaNegocios(1102, "Maria", 1000.0, 400.0));
		list.add(new ContaPoupanca(1003, "Bob", 300.0, 0.01));
		list.add(new ContaNegocios(1004, "Anna", 500.0, 500.1));
		
		double soma = 0.0;
		for (Account acc : list) {
			soma += acc.getSaldo();
		}
		System.out.printf("Total saldo: R$ %.2f", soma);
		System.out.println();
		
		for (Account acc : list) {
			acc.deposito(10.0);;
		}
		
		for (Account acc : list) {
			System.out.println(acc.getSaldo());
		}
	}

}
