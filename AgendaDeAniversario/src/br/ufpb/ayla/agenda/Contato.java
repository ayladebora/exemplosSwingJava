package br.ufpb.ayla.agenda;

import java.util.Objects;

public class Contato {

	private String nome;
	private int dia;
	private int mes;
	
	public Contato(String nome, int dia, int mes) {
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
	}
	
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dia=" + dia + ", mes=" + mes + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}


	
	
}
