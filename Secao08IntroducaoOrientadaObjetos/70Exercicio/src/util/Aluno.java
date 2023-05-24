package util;

public class Aluno {
	public String nome;
	public double nota;
	
	public void total(double valor) {
		nota += valor;
	}
	
	public String toString() {
		if (nota < 60) {
			return String.format("Nota total: %.2f Faltou: %.2f Para passar", nota, 60 - nota);
		}
		else {
			return String.format("Nota total: %.2f%	Parab�ns Voc� passou", nota, 60 - nota);
		}
	}
}
