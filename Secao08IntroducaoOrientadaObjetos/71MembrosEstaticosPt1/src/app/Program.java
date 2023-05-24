package app;

import java.util.Locale;
import java.util.Scanner;

import util.Estatico;

public class Program {
	public static void main(String[] args) {
//		Também chamados membros de classe
//		• Em oposição a membros e instância
//		• São membros que fazem sentido independentemente de objetos. Não
//		precisam de objeto para serem chamados. São chamados a partir do
//		próprio nome da classe.
//		• Aplicações comuns:
//		• Classes utilitárias
//		• Declaração de constantes
//		• Uma classe que possui somente membros estáticos, pode ser uma classe
//		estática também. Esta classe não poderá ser instanciada.
		
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
