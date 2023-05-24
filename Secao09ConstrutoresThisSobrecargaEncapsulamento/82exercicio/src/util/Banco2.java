package util;

public class Banco2 {
	private String numero;
	private String nome;
	private double saldo;
	
	public Banco2(String numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}
	public Banco2(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public String getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= saque + 5;
	}

	public String toString() {
		return String.format("Conta %s, Usuario: %s, Saldo atual: R$%.2f", numero, nome, saldo);
	}
	
	
}
