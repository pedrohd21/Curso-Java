package entities;

public class ProdutoUsado extends Produto{
	private String data;

	public ProdutoUsado() {
		
	}
	
	public ProdutoUsado(String nome, Double preco, String data) {
		super(nome, preco);
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String etiqueta() {
		return String.format("%s (usado) R$ %.2f (Data de fabricação: %s)", getNome(), getPreco(), data);
	}
}
