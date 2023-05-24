package util;

public class Moeda {
	public static final double IOF = 0.06;
	public double dolar;
	public double real;
	
	public double conversor() {
		return (dolar * real * IOF) + (dolar * real);
	}
	
	public String toString() {
		return String.format("Valor convertido para real = R$%.2f", conversor());
	}
}
