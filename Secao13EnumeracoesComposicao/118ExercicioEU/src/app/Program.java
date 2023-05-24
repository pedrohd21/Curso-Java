package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelContrato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome do departamento: ");
		String departamento = sc.nextLine();
		
		System.out.print("Insira a data de trabalho:");
		System.out.print("Nome: ");
		String nomeTrabalho = sc.nextLine();
		
		System.out.print("Nivel: ");
		String nivelTrabalho = sc.nextLine();
		System.out.print("Base salario: ");
		double baseSalario = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalho, NivelContrato.valueOf(nivelTrabalho), baseSalario, new Departamento(departamento));
		
		System.out.print("Quantos contratos para este trabalhador? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Digite o contrato " + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contratoData = sdf.parse(sc.next())
		}
		
		
		sc.close();
	}

}
