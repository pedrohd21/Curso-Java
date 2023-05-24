package entities;

public class ContaPoupanca extends Account{
	private Double taxaJuro;

	public ContaPoupanca(Double taxaJuro) {
		super();
	}

	public ContaPoupanca(Integer numero, String holder, Double saldo, Double taxaJuro) {
		super(numero, holder, saldo);
		this.taxaJuro = taxaJuro;
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	public void updateBalance() {
		saldo += saldo * taxaJuro;
	}
	
	@Override //sobrescrever tbm
	public void saque(double resultado) { 
		saldo -= resultado;
	}
	
}
