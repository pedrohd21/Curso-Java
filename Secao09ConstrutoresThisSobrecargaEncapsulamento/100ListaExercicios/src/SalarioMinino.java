import java.util.Scanner;

public class SalarioMinino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salario minino: ");
		double salario = sc.nextDouble();
		
		System.out.println("Salario: ");
		double salario1 = sc.nextDouble();
		
		
		System.out.printf("Salario %.2f, da %.1f salarios minimos", salario1, salario1/salario);
		

	}

}
