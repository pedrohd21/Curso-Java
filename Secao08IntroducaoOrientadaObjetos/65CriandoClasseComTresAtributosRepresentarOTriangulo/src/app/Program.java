package app;

import java.util.Locale;
import java.util.Scanner;

import util.Triangulo;

public class Program {

	public static void main(String[] args) {
//		Classe
//		� � um tipo estruturado que pode conter (membros):
//		� Atributos (dados / campos)
//		� M�todos (fun��es / opera��es)
//		� A classe tamb�m pode prover muitos outros recursos, tais como:
//		� Construtores
//		� Sobrecarga
//		� Encapsulamento
//		� Heran�a
//		� Polimorfismo
//		� Exemplos:
//		� Entidades: Produto, Cliente, Triangulo
//		� Servi�os: ProdutoService, ClienteService, EmailService, StorageService
//		� Controladores: ProdutoController, ClienteController
//		� Utilit�rios: Calculadora, Compactador
//		� Outros (views, reposit�rios, gerenciadores, etc.)
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		y = new Triangulo();
		x = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
		System.out.println("Maior area: X");
		}
		else {
		System.out.println("Maior area: Y");
		}
		sc.close();
	}

}
