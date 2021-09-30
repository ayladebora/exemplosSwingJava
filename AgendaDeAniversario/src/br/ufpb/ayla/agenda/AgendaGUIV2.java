package br.ufpb.ayla.agenda;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AgendaGUIV2 extends JFrame {
	
	JLabel linha1, linha2;
	ImageIcon boloImg = new ImageIcon("./imgs/cake.jpg");
	
	public AgendaGUIV2() {
		setTitle("Agenda de Aniversários");
		setSize(400, 400);
		setLocation(150, 150);
		setResizable(true);
		getContentPane().setBackground(Color.WHITE);
		linha1  = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
		linha1.setForeground(Color.red);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(boloImg, JLabel.CENTER);
		getContentPane().setLayout(new GridLayout(3,1));
		this.add(linha1);
		this.add(linha2);
	}
	
	
	public static void main(String [] args) {
		JFrame janela = new AgendaGUIV2();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	

}
