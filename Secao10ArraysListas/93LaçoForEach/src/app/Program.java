package app;

public class Program {

	public static void main(String[] args) {
//		La�o "for each"
//		Sintaxe opcional e simplificada para percorrer cole��es
//		Sintaxe:
//		for (Tipo apelido : cole��o) {
//		<comando 1>
//		<comando 2>
//		}

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
