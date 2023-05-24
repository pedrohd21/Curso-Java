import java.util.Locale;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Anos: ");
		int anos = sc.nextInt();
		
		System.out.println("Meses: ");
		int mes = sc.nextInt();
		
		System.out.println("Dias: ");
		int dia = sc.nextInt();
		
		System.out.printf("%d anos, %d meses e %d dias = %d dias.", anos, mes, dia, (anos * 365) + (mes * 30) + dia);
	}
}
