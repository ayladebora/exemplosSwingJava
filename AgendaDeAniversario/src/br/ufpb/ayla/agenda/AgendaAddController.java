package br.ufpb.ayla.agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgendaAddController implements ActionListener {

	private Agenda agenda;
	private JFrame janelaPrincipal;
	
	public AgendaAddController(Agenda agenda, JFrame janelaPrincipal) {
		this.agenda = agenda;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		janelaPrincipal.setVisible(false);
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome do aniversariante?");
		int dia = Integer.parseInt( JOptionPane.showInputDialog(janelaPrincipal,"Qual o dia do mês em que nasceu? [1-31]"));
		int mes = Integer.parseInt( JOptionPane.showInputDialog(janelaPrincipal,"Qual o mês em que nasceu? [1-12]"));
		boolean cadastrou = agenda.cadastraContato(nome, dia, mes);
		if (cadastrou) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante cadastrado");
		} else {
			JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante não foi cadastrado. Verifique se já existia alguém com esse nome");
		}
		janelaPrincipal.setVisible(true);
	}

}
