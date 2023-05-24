package app;

public class Program {

	public static void main(String[] args) {
//		Laço "for each"
//		Sintaxe opcional e simplificada para percorrer coleções
//		Sintaxe:
//		for (Tipo apelido : coleção) {
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
