package app;

import entities.Account;
import entities.ContaNegocios;
import entities.ContaPoupanca;

//123 Visão geral do capítulo Herança e Polimorfismo
//124
//125 Herança
//126 Upcasting e downcasting
//127 Sobreposição, palavra super, anotação @Override
//128 Classes e métodos final
//129 Introdução ao polimorfismo

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
