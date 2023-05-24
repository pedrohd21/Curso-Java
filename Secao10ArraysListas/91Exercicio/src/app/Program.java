package app;

import java.util.Locale;
import java.util.Scanner;

import util.Internato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Internato[] vect = new Internato[10];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int room = sc.nextInt();
			vect[room] = new Internato(name, email, room);
		}
		System.out.println();
		System.out.println("Busy rooms");
		
		for (int i=0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.printf(i + ": " + vect[i]);
			}
		}
		sc.close();

	}

}
