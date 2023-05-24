package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Insira o numero de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Dados do contribuinte n°" + i);
			System.out.println("Pessoa fisica ou juridica (f / j): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			if(ch == 'f') {
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				
				System.out.println("Renda anual: R$ ");
				double rendaAnual = sc.nextDouble();
				
				System.out.println("Gasto saude: R$");
				double saude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, saude));
			}
			else {
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				
				System.out.println("Renda anual: R$ ");
				double rendaAnual = sc.nextDouble();
				
				System.out.println("Funcionario: ");
				int funcionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionario));
			}
			
		}
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for(Pessoa pes : list) {
			System.out.printf("%s: R$%.2f \n", pes.getNome(), pes.imposto());
		}
		sc.close();
	}

}
