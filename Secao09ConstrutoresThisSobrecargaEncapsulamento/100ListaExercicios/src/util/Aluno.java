package util;

public class Aluno {
	private String matricula;
	private String nome;
	private double nota;
	
	public Aluno() {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	public String matriculaAluno(String matriculaA, String nomeA) {
		this.matricula = matriculaA;
		this.nome = nomeA;
		return "Aluno: " + nomeA + ", Matricula: " + this.matricula;
	}

	public double total(double nota1, double nota2, double nota3) {
		double total = (nota1 * 0.4) + (nota2 * 0.4) + (nota3 * 0.2);
		this.nota = total;
		return this.nota;
	}


	public String toString() {
		if (this.nota >= 6) {
			return String.format("%s Aprovado: %.2f ", this.nome, this.nota);
		}
		else {
			return String.format("%s Reprovado: %.2f ", this.nome, this.nota);
		}
		
	}
	
}