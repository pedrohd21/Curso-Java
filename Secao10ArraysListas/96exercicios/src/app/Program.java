package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios registrados? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Funcionario " + i + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);
		}
		
		System.out.print("Digite o id do funcionario para aumento de salario: ");
		int idsalario = sc.nextInt();
		Integer pos = posicao(list, idsalario);
		if (pos == null) {
			System.out.println("Esse id nao existe.");
		}
		else {
			System.out.println("Digite a porcetagem: ");
			double porcento = sc.nextDouble();
			list.get(pos).aumento(porcento);
			}
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}
	
	public static Integer posicao(List<Funcionario> list, int id) {
		for (int c = 0; c < list.size(); c++) {
			if (list.get(c).getId() == id) {
				return c;
			}
		}
		return null;
	}
}
