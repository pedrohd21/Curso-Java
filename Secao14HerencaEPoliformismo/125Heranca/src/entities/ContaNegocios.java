package entities;

public class ContaNegocios extends Account{
	private Double limiteEmprestimo;

	public ContaNegocios() {
		super();
	}

	public ContaNegocios(Integer numero, String holder, Double saldo, Double limiteEmprestimo) {
		super(numero, holder, saldo);
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
}
