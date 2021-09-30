package br.ufpb.ayla.agenda;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgendaGUI extends JFrame {

	
	public AgendaGUI() {
		setTitle("Agenda de Aniversários");
		setSize(400, 200);
		setLocation(150, 150);
		setResizable(false);
		getContentPane().setBackground(Color.BLUE);
	}
	
	public static void main(String [] args) {
		JFrame janela = new AgendaGUI();
		janela.setVisible(true);
		
		WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(janela, "Vou fechar o programa");
				System.exit(0);
			}
		};
		
//		WindowListener fechadorDeJanelaPrincipal = new FechadorDeJanelaPrincipal(janela);
		janela.addWindowListener(fechadorDeJanelaPrincipal);
		
	}
	
	
}
