import java.util.Locale;
import java.util.Scanner;

import util.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Aluno aluno = new Aluno();
		
		System.out.println("Media Escolar: ");
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Matricula: ");
		String matricula = sc.nextLine();
		
		aluno.matriculaAluno(matricula, nome);
		
		System.out.println();
		System.out.println("Notas");
		System.out.println("Nota 1: ");
		double n1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		double n2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		double n3 = sc.nextDouble();
		
		aluno.total(n1, n2, n3);
		System.out.println();
		System.out.println(aluno);
		
		sc.close();
	}

}
