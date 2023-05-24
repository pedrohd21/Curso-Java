package entities;

public abstract class Account { //add classe abstrata
	private Integer numero;
	private String holder;
	protected Double saldo;
	
	public Account() {
	}
	
	public Account(Integer numero, String holder, Double saldo) {
		this.numero = numero;
		this.holder = holder;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(double resultado) { 
		saldo -= resultado + 5;
	}
	
	public void deposito(double resultado) {
		saldo += resultado;
	}
	
	
}
