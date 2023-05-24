package app;

import java.util.Locale;

import  java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Vetores
//		• Em programação, "vetor" é o nome dado a arranjos unidimensionais
//		• Arranjo (array) é uma estrutura de dados: • Homogênea (dados do mesmo tipo)
//		• Ordenada (elementos acessados por meio de posições)
//		• Alocada de uma vez só, em um bloco contíguo de memória
//		• Vantagens:
//		• Acesso imediato aos elementos pela sua posição
//		• Desvantagens:
//		• Tamanho fixo
//		• Dificuldade para se realizar inserções e deleções
		
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
