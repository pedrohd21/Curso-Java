package app;

import entities.Account;
import entities.ContaNegocios;
import entities.ContaPoupanca;

//123 Vis�o geral do cap�tulo Heran�a e Polimorfismo
//124
//125 Heran�a
//126 Upcasting e downcasting
//127 Sobreposi��o, palavra super, anota��o @Override
//128 Classes e m�todos final
//129 Introdu��o ao polimorfismo

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "alex", 1000.0);
		Account y = new ContaPoupanca(1023, "maria", 1000.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	}

}
