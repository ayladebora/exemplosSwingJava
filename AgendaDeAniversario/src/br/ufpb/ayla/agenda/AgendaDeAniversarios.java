package br.ufpb.ayla.agenda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaDeAniversarios implements Agenda{

	private Map<String, Contato> contatos;
	
	
	public AgendaDeAniversarios() {
		this.contatos = new HashMap<>();
	}
	
	@Override
	public boolean cadastraContato(String nome, int dia, int mes) {
		if (!contatos.containsKey(nome)) {
			this.contatos.put(nome, new Contato(nome, dia, mes));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
		Collection<Contato> aniversariantes = new ArrayList<>();
		for (Contato c: this.contatos.values()) {
			if (c.getDia()==dia && c.getMes()==mes) {
				aniversariantes.add(c);
			}
		}
		return aniversariantes;
	}

	@Override
	public boolean removeContato(String nome) {
		Contato c = this.contatos.remove(nome);
		if (c == null) {
			return false;
		} else {
			return true;
		}
	}

	
}
