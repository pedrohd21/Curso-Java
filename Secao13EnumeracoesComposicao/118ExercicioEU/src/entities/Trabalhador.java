package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelContrato;

public class Trabalhador {
	private String nome;
	private  NivelContrato level;
	private Double baseSalario;
	
	private Departamento departamento; // Associacoes
	private List<HorasContrato> contrato = new ArrayList<>(); // nao incluir no construtor
	
	public Trabalhador() {
	}

	//criar normall
	public Trabalhador(String nome, NivelContrato level, Double baseSalario, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	//criar os getters e setters normal, so remover o set contratos por rescrever a lista
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelContrato getLevel() {
		return level;
	}

	public void setLevel(NivelContrato level) {
		this.level = level;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContrato() {
		return contrato;
	}
	
	public void addContratos(HorasContrato contrato) {
		this.contrato.add(contrato);
	}

	public void removeContrato(HorasContrato contrato) {
		this.contrato.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = baseSalario;
		Calendar cal = Calendar.getInstance();
		for (HorasContrato c : contrato) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.totalValor();
			}
		}
		return soma;
	}
}
