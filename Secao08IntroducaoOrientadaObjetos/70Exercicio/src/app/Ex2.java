package app;

import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.printf("Salario Liquido Atual: R$" + funcionario);
		
		System.out.print("Digite a porcentagem para adicionar: ");
		double aumento = sc.nextDouble();
		funcionario.aumento(aumento);
		
		System.out.printf("Salario Atualizado: R$" + funcionario);
		sc.close();
	}

}
