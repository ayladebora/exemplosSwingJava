package br.ufpb.ayla.agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgendaSearchController implements ActionListener {

	private Agenda agenda;
	private JFrame janelaPrincipal;
	
	public AgendaSearchController(Agenda agenda, JFrame janelaPrincipal) {
		this.agenda = agenda;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int dia = Integer.parseInt( JOptionPane.showInputDialog(janelaPrincipal,"Qual o dia do mês a pesquisar? [1-31]"));
		int mes = Integer.parseInt( JOptionPane.showInputDialog(janelaPrincipal,"Qual o mês a pesquisar? [1-12]"));
		Collection<Contato> aniversariantesDoMes = agenda.pesquisaAniversariantes(dia, mes);
		if (aniversariantesDoMes.size() != 0) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariantes encontrados:");
			for (Contato c: aniversariantesDoMes) {
				JOptionPane.showMessageDialog(janelaPrincipal, c.toString());
			}
		} else {
			JOptionPane.showMessageDialog(janelaPrincipal, "Não foi encontrado nenhum aniversariante nesta data. ");
		}
	}

}
