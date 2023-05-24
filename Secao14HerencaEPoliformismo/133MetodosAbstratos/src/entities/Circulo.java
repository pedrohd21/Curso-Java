package entities;

import entities.enums.Cor;

public class Circulo extends Forma{

	private Double raio;
	
	public Circulo() {
		
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}
	
}
