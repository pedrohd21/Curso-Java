import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class ProgramCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Soma");
		System.out.print("Numero 1: ");
		double n1 = sc.nextDouble();
		System.out.print("Numero 2: ");
		double n2 = sc.nextDouble();
		double soma = Calculadora.soma(n1, n2);
		
		System.out.println();
		System.out.println("Subtração");
		System.out.print("Numero 1: ");
		n1 = sc.nextDouble();
		System.out.print("Numero 2: ");
		n2 = sc.nextDouble();
		double subtrair = Calculadora.subtrair(n1, n2);
		
		System.out.println();
		System.out.println("Dividir");
		System.out.print("Numero 1: ");
		n1 = sc.nextDouble();
		System.out.print("Numero 2: ");
		n2 = sc.nextDouble();
		double dividir = Calculadora.dividir(n1, n2);
		
		System.out.println();
		System.out.println("Multiplicação");
		System.out.print("Numero 1: ");
		n1 = sc.nextDouble();
		System.out.print("Numero 2: ");
		n2 = sc.nextDouble();
		double mult = Calculadora.multiplicar(n1, n2);
		
		System.out.println();
		System.out.printf("Resultado %nSoma = %.2f%nSubtração = %.2f%nDividir = %.2f%nMultiplicação = %.2f", soma, subtrair, dividir, mult);
	}

}
