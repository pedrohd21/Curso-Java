package app;

import java.util.Locale;

import  java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Vetores
//		� Em programa��o, "vetor" � o nome dado a arranjos unidimensionais
//		� Arranjo (array) � uma estrutura de dados: � Homog�nea (dados do mesmo tipo)
//		� Ordenada (elementos acessados por meio de posi��es)
//		� Alocada de uma vez s�, em um bloco cont�guo de mem�ria
//		� Vantagens:
//		� Acesso imediato aos elementos pela sua posi��o
//		� Desvantagens:
//		� Tamanho fixo
//		� Dificuldade para se realizar inser��es e dele��es
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {  // Pega os numeros digitados, e coloca nas possicoes
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		System.out.printf("Media %.2f", media);
		sc.close();

	}

}
