package br.ufpb.ayla.agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgendaRemoveController implements ActionListener {

	private Agenda agenda;
	private JFrame janelaPrincipal;

	public AgendaRemoveController(Agenda agenda, JFrame janelaPrincipal) {
		this.agenda = agenda;
		this.janelaPrincipal = janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog(janelaPrincipal, 
				"Qual o nome do aniversariante a remover?");
		boolean removeu = agenda.removeContato(nome);
		if (removeu) {
			JOptionPane.showMessageDialog(janelaPrincipal, 
					"Aniversariante removido com sucesso");
		} else {
			JOptionPane.showMessageDialog(janelaPrincipal, 
					"Aniversariante não foi encontrado. Operação não realizada");
		}

	}

}
