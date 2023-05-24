package tudo;

public class Program {

	public static void main(String[] args) {
//		� Formatar: toLowerCase(), toUpperCase(), trim()
//		� Recortar: substring(inicio), substring(inicio, fim)
//		� Substituir: Replace(char, char), Replace(string, string)
//		� Buscar: IndexOf, LastIndexOf
//		� str.Split(" ")
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase(); // Letra minuscula
		String s02 = original.toUpperCase(); // Letra maiuscula
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
