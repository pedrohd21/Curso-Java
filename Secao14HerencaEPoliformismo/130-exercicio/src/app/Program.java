package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Digite o numero de funcionario: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i + " data: ");
			System.out.print("Terceirizado (S/N)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas Trabalhadas: ");
			int hora = sc.nextInt();
			
			System.out.println("Valor Por Hora: ");
			double valorPorHora = sc.nextDouble();
			
			if(ch == 's') {
				System.out.print("Cobrança Adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				list.add(new FuncionarioTerceirizado(nome, hora, valorPorHora, cobrancaAdicional));
			}
			else {
				list.add(new Funcionario(nome, hora, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("Pagamento:");
		for (Funcionario func : list) {
			System.out.println(func.getNome() + " -$ " + String.format("%.2f", func.pagamento()));
		}
		
		sc.close();
	}

}
