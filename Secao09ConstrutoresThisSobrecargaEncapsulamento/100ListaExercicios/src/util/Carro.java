package util;

public class Carro {
	private String cor;
	private String modelo;
	private String placa;
	private String ano;
	private int velocidade;
	
	public Carro(String cor, String modelo, String placa, String ano) {
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public int getVelocidade(int velocidade) {
		return velocidade;
	}
	
	public int diminuir() {
		velocidade -= 1;
		return velocidade;
	}
	
	public int aumentar() {
		velocidade += 1;
		return velocidade;
	}
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", velocidade="
				+ velocidade + "]";
	}
	
	
	
}
