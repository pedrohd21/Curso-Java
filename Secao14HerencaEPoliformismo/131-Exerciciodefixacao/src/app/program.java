package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Digite o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do produto " + i +": ");
			System.out.println("Comum, usado ou importado (c, u, i): ");
			char ch = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Preco: ");
			double preco = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.println("Taxa alfandega: ");
				double alfandega = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, alfandega));
			}
			if (ch == 'u') {
				System.out.println("Data de fabricação: ");
				sc.nextLine();
				String data = sc.nextLine();
				list.add(new ProdutoUsado(nome, preco, data));
			}
			if (ch == 'c'){
				list.add(new Produto(nome, preco));
			}
			System.out.println();
			System.out.println("Etiquetas de Preco: ");
			for (Produto pro : list) {
				System.out.println(pro.etiqueta());
			}
		}
		sc.close();
	}

}
