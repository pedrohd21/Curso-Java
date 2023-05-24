import java.util.Locale;
import java.util.Scanner;

import util.Carro;
public class ProgramCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Carro carro;
		
		System.out.print("Cor do carro: ");
		String cor = sc.nextLine();
		
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		
		System.out.print("Placa do carro: ");
		String placa = sc.nextLine();
		
		System.out.print("Ano do carro: ");
		String ano = sc.nextLine();

		carro = new Carro(cor, modelo, placa, ano);
		System.out.println(carro);
		
		System.out.println("Velocidade: "+ carro.aumentar());
		System.out.println("Velocidade: "+ carro.aumentar());
		System.out.println("Velocidade: "+ carro.aumentar());
		System.out.println("Velocidade: "+ carro.aumentar());
		System.out.println("Velocidade: "+ carro.aumentar());

		
		System.out.println("Velocidade: "+ carro.diminuir());
		System.out.println("Velocidade: "+ carro.diminuir());
		System.out.println("Velocidade: "+ carro.diminuir());
		System.out.println("Velocidade: "+ carro.diminuir());

	}

}
