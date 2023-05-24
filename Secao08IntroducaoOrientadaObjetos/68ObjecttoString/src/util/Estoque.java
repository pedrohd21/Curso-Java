package util;

public class Estoque {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double total() {
		return this.preco * this.quantidade;
	}
	
	public void adicionar(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void remover(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return String.format("%s, R$%.2f, %d unidades, Total: R$%.2f%n", nome, preco ,quantidade, total());
	}
}
