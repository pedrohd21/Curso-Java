package util;

public class Bola {
	private String cor;
	private String tamanho;
	private String material;
	
	public Bola(String cor, String tamanho, String material) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void trocar_cor(String new_cor) {
		this.cor = new_cor;
	}
	
	public String mostrar_cor() {
		return this.cor;
	}
}
