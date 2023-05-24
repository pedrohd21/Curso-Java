package app;

import java.util.Locale;
import java.util.Scanner;

import util.Estatico;

public class Program {
	public static void main(String[] args) {
//		Tamb�m chamados membros de classe
//		� Em oposi��o a membros e inst�ncia
//		� S�o membros que fazem sentido independentemente de objetos. N�o
//		precisam de objeto para serem chamados. S�o chamados a partir do
//		pr�prio nome da classe.
//		� Aplica��es comuns:
//		� Classes utilit�rias
//		� Declara��o de constantes
//		� Uma classe que possui somente membros est�ticos, pode ser uma classe
//		est�tica tamb�m. Esta classe n�o poder� ser instanciada.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estatico calc = new Estatico();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();
	}

}
