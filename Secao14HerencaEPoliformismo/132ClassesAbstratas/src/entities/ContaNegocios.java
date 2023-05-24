package entities;

public class ContaNegocios extends Account{ //Usar heranca
	private Double limiteEmprestimo;

	public ContaNegocios() {
		super();
	}

	public ContaNegocios(Integer numero, String holder, Double saldo, Double limiteEmprestimo) {
		super(numero, holder, saldo); //usar na classe
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double resultado) {
		if (resultado <= limiteEmprestimo) {
			saldo += resultado - 10;
		}
	}
	
	@Override  //Override é sobrescrever 
	public void saque(double resultado) { 
		super.saque(resultado);
		saldo -= 2.0;
	}
}
