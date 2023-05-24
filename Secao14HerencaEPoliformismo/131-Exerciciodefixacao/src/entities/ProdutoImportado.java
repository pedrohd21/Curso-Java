package entities;

public class ProdutoImportado extends Produto{
	private Double alfandega;
	
	public ProdutoImportado() {
	
	}
	
	public ProdutoImportado(String nome, Double preco, Double alfandega) {
		super(nome, preco);
		this.alfandega = alfandega;
	}

	public Double getAlfandega() {
		return alfandega;
	}

	public void setAlfandega(Double alfandega) {
		this.alfandega = alfandega;
	}
	
	public Double totalPreco() {
		return getPreco() + alfandega;
	}
	
	@Override
	public String etiqueta() {
		return String.format("%s R$ %.2f (taxa da alfandega: R$ %.2f)", getNome(), totalPreco(), alfandega);
	}
	
}
