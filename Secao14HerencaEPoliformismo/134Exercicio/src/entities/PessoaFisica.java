package entities;

public class PessoaFisica extends Pessoa{
	private Double saude;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double saude) {
		super(nome, rendaAnual);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}
	
	@Override
	public double imposto() {
		if (getRendaAnual() < 2000) {
			return (getRendaAnual() * 0.15) - (saude * 0.5);
		}
		else {
			return (getRendaAnual() * 0.25) - (saude * 0.5);
		}
	}
	
}
