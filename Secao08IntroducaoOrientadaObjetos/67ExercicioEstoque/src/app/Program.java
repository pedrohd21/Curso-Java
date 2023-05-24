package app;

import java.util.Locale;
import java.util.Scanner;

import util.Estoque;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Estoque estoque = new Estoque();
		
		System.out.println("Entrada de produtos: ");
		System.out.print("Nome: ");
		estoque.nome = sc.nextLine();
		
		System.out.print("Preco: ");
		estoque.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		estoque.quantidade = sc.nextInt();
		
		System.out.printf("Produto inicial: %s, R$%.2f, %d unidades, Total: R$%.2f%n", estoque.nome, estoque.preco ,estoque.quantidade, estoque.total());
		
		System.out.print("Digite a quantidade a ser adicionada: ");
		int adiciona = sc.nextInt();
		estoque.adicionar(adiciona);
		
		System.out.printf("Produto atualizado: %s, R$%.2f, %d unidades, Total: R$%.2f%n", estoque.nome, estoque.preco ,estoque.quantidade, estoque.total());
		
		System.out.println("Digite a quantidade a ser removida: ");
		adiciona = sc.nextInt();
		estoque.remover(adiciona);
		
		System.out.printf("Produto Final: %s, R$%.2f, %d unidades, Total: R$%.2f%n", estoque.nome, estoque.preco ,estoque.quantidade, estoque.total());
		
		
		sc.close();
	}

}
