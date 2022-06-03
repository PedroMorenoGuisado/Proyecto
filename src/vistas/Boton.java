package vistas;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Boton extends JFrame implements ActionListener{
	JButton boton;
	JLabel texto;
	public Boton() {
		getContentPane().setBackground(Color.ORANGE);
		setVisible(true);
		getContentPane().setLayout(null);
		boton=new JButton("SALIR");
		boton.setFont(new Font("Tahoma", Font.BOLD, 11));
		boton.setBackground(new Color(255, 140, 0));
		boton.setBounds(94,149,100,30);
		boton.addActionListener(this);
		getContentPane().add(boton);
		texto=new JLabel("Presione el botón para salir.");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		texto.setBounds(43,44,220,40); getContentPane().add(texto);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if (e.getSource()==boton) { 
				setTitle("Saldrá en 3 segundos");
				try{ 
				Thread.sleep(3000); 
				System.exit(0);
			} 
			catch(Exception excep) { 
				System.exit(0); 
			} 
		}
	}
}
