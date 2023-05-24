package entities;

public class FuncionarioTerceirizado extends Funcionario{
	private Double cobrancaAdicional;

	public FuncionarioTerceirizado() {
		super();
	}
	
	public FuncionarioTerceirizado(String nome, Integer hours, Double valorPorHora, Double cobrancaAdicional) {
		super(nome, hours, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;
	}
}
