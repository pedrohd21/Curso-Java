package app;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Posição Invalida");
		}
		catch (InputMismatchException e) {
			System.out.println("Valor inserido invalido");
		}
		
		System.out.println("Fim do Programa");
		sc.close();
	}

}
