import java.util.Scanner;

public class AntecessorESucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		
		System.out.printf("%d %d %d", numero - 1, numero, numero + 1);

	}

}
