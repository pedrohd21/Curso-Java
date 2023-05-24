package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;

public class Program2 {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>(); //Declarar a lista
//		list.add("Anna"); 
//		list.add(2, "Marco"); // no local selecionado
//		System.out.println(list.size()); //Tamanho da lista
//		list.remove("Anna"); // remove com a compacao
//		list.remove(1); // remove a posicao
//		for (String x : list) {  // Mostrar a lista
//			System.out.println(x);
//		}
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantas pessoas registrar? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int c=0; c<n; c++) {
			System.out.printf("Usuario %d: %n", c+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);
			System.out.println();
		}
		
		System.out.println("Id funcionario aumento: ");
		int posicao = sc.nextInt();
		sc.nextLine();
		
		boolean usu = false;
		for (int c=0; c<list.size();c++) {
			if (list.get(c).getId() == posicao) {
				System.out.println("Valor aumento: ");
				double acrecimo = sc.nextDouble();
				list.get(c).aumento(acrecimo);
				usu = true;
				System.out.println();
				break;
			}
		}
		if (usu == false) {
			System.out.println("Esse usuario nao existe.");
			System.out.println();
			for(Funcionario x : list) {
				System.out.println(x);
			}
		}
		else {
			System.out.println("Lista de funcionarios");
			for(Funcionario x : list) {
				System.out.println(x);
			}
		}
		sc.close();
	}

}
