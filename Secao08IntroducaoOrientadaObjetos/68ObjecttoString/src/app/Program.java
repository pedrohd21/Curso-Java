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
		System.out.println();
		
		System.out.print("Produto inicial: " + estoque);
		System.out.println();
		
		System.out.print("Digite a quantidade a ser adicionada: ");
		int adiciona = sc.nextInt();
		estoque.adicionar(adiciona);
		System.out.println();
		
		System.out.print("Produto Atualizado: " + estoque);
		
		System.out.print("Digite a quantidade a ser removida: ");
		adiciona = sc.nextInt();
		estoque.remover(adiciona);
		System.out.println();
		
		System.out.print("Produto final: " + estoque);		
		sc.close();
		
//		• Toda classe em Java é uma subclasse da classe Object
//		• Object possui os seguintes métodos:
//		• getClass- retorna o tipo do objeto
//		• equals - compara se o objeto é igual a outro
//		• hashCode - retorna um código hash do objeto
//		• toString - converte o objeto para string
	}

}
