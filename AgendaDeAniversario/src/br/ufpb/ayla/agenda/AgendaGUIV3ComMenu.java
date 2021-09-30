package br.ufpb.ayla.agenda;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AgendaGUIV3ComMenu extends JFrame{
	
	JLabel linha1, linha2;
	ImageIcon boloImg = new ImageIcon("./imgs/cake.jpg");
	Agenda agenda = new AgendaDeAniversarios();
	JMenuBar barraDeMenu = new JMenuBar();
	
	public AgendaGUIV3ComMenu() {
		setTitle("Agenda de Aniversários");
		setSize(800, 600);
		setLocation(150,150);
		setResizable(true);
		getContentPane().setBackground(Color.white);
		linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
		linha1.setForeground(Color.RED);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(boloImg, JLabel.CENTER);
		 
		setLayout(new GridLayout(3,1));
		add(linha1);
		add(linha2);
		add(new JLabel());
		JMenu menuCadastrar = new JMenu("Cadastrar");
		JMenuItem menuCadastrarAniversariante= new JMenuItem("Cadastrar aniversariante");
		menuCadastrar.add(menuCadastrarAniversariante);
		JMenu menuPesquisar = new JMenu("Pesquisar");
		JMenuItem menuPesquisarAniversariante = new JMenuItem("Pesquisar aniversariante");
		menuPesquisar.add(menuPesquisarAniversariante);
		JMenu menuRemover = new JMenu("Remover");
		JMenuItem menuRemoverAniversariante = new JMenuItem("Remover aniversariante");
		menuRemover.add(menuRemoverAniversariante);
		
		//menuCadastrarAniversariante.addActionListener(new AgendaAddController(agenda, this));
		menuPesquisarAniversariante.addActionListener(new AgendaSearchController(agenda, this));
		menuRemoverAniversariante.addActionListener(new AgendaRemoveController(agenda,this));
		
		menuCadastrarAniversariante.addActionListener(
		    (ae) -> {
		    	String nome = JOptionPane.showInputDialog(this, "Qual o nome do aniversariante?");
				int dia = Integer.parseInt( JOptionPane.showInputDialog(this,"Qual o dia do mês em que nasceu? [1-31]"));
				int mes = Integer.parseInt( JOptionPane.showInputDialog(this,"Qual o mês em que nasceu? [1-12]"));
				boolean cadastrou = agenda.cadastraContato(nome, dia, mes);
				if (cadastrou) {
					JOptionPane.showMessageDialog(this, "Aniversariante cadastrado");
				} else {
					JOptionPane.showMessageDialog(this, "Aniversariante não foi cadastrado. Verifique se já existia alguém com esse nome");
				}
		    }
		);
		barraDeMenu.add(menuCadastrar);
		barraDeMenu.add(menuPesquisar);
		barraDeMenu.add(menuRemover);
		setJMenuBar(barraDeMenu);
	}
	
	
	public static void main(String [] args) {
		JFrame janela = new AgendaGUIV3ComMenu();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
