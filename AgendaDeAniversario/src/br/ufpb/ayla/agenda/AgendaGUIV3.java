package br.ufpb.ayla.agenda;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AgendaGUIV3 extends JFrame{
	
	JLabel linha1, linha2;
	ImageIcon boloImg = new ImageIcon("./imgs/cake.jpg");
	ImageIcon addImg = new ImageIcon("./imgs/add.png");
	ImageIcon pesqImg = new ImageIcon("./imgs/search.png");
	ImageIcon removeImg = new ImageIcon("./imgs/delete.png");
	JButton botaoAdicionar, botaoPesquisar, botaoRemover;
	
	Agenda agenda = new AgendaDeAniversarios();
	
	public AgendaGUIV3() {
		setTitle("Agenda de Aniversários");
		setSize(800, 600);
		setLocation(150,150);
		setResizable(true);
		getContentPane().setBackground(Color.white);
		linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
		linha1.setForeground(Color.RED);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(boloImg, JLabel.CENTER);
		botaoAdicionar = new JButton("Adicionar", addImg);
		botaoAdicionar.addActionListener(new AgendaAddController(agenda, this));
		botaoPesquisar = new JButton("Pesquisar", pesqImg);
		botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
		botaoRemover = new JButton("Remover", removeImg);
		botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));
		setLayout(new GridLayout(3,2));
		add(linha1);
		add(botaoAdicionar);
		add(linha2);
		add(botaoPesquisar);
		add(new JLabel());
		add(botaoRemover);
	}
	
	public static void main(String [] args) {
		JFrame janela = new AgendaGUIV3();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
	
	

}
