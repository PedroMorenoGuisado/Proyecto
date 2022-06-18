package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVentanas;

import javax.swing.JButton;
import java.awt.Color;

public class Formulario extends JFrame {

	private JPanel contentPane;

	public Formulario() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar niveles");
		btnNewButton.setBounds(166, 206, 116, 23);
		contentPane.add(btnNewButton);
		
		JButton botonTabla = new JButton("TablaEstadisticasJugador");
		botonTabla.setBounds(156, 58, 126, 23);
		contentPane.add(botonTabla);
		
		JButton btnNewButton_1 = new JButton("Entrar tablajugadores");
		btnNewButton_1.setBounds(156, 162, 137, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ControladorVentanas().abrirCrearTablajugadores();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ControladorVentanas().abrirCrearJugadores();
			}
		});

		botonTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ControladorVentanas().abrirTablaBBDD();
			}
		});
	}
}
