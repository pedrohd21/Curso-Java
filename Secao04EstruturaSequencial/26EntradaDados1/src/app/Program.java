package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}

}
//• Scanner
//• next()
//• nextInt()
//• nextDouble()
//• next().charAt(0)
//• Locale
//• Como ler até a quebra de linha
//• nextLine()
//• como limpar o buffer de leitura
