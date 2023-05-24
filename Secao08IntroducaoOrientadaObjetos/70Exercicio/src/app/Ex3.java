package app;

import java.util.Locale;
import java.util.Scanner;

import util.Aluno;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nota 1: ");
		double nota = sc.nextDouble();
		aluno.total(nota);
		
		System.out.print("Nota 2: ");
		nota = sc.nextDouble();
		aluno.total(nota);
		
		System.out.print("Nota 3: ");
		nota = sc.nextDouble();
		aluno.total(nota);
		
		System.out.println(aluno);
		sc.close();
	}

}
