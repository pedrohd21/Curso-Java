package util;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salario() {
		return salarioBruto - taxa;
	}
	
	public void aumento(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100;
	}
	
	public String toString() {
		return String.format("%.2f%n", salario());
	}
}
