package entities;

public class PessoaJuridica extends Pessoa{
	private Integer funcionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionario) {
		super(nome, rendaAnual);
		this.funcionario = funcionario;
	}

	public Integer getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Integer funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public double imposto() {
		if (funcionario <= 10) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
	}
	
	
	
	
}
