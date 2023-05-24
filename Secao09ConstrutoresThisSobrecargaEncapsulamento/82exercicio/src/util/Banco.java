package util;

public class Banco {
	private String conta;
	private String nome;
	private double valor;
	
	public Banco(){

	}

	public Banco(String conta, String nome, double inicialDeposito) {
		this.conta = conta;
		this.nome = nome;
		deposito(inicialDeposito);
	}
	
	public Banco(String conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public String getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}

	
	public void deposito(double valor) {
		this.valor += valor;
	}
	public void saque(double valor) {
		this.valor -= valor + 5;
	}
	
	public String toString() {
		return "Account " + getConta() + ", Holder: " + getNome() + String.format(", Banlance: R$%.2f %n", getValor());
	}
	
}
