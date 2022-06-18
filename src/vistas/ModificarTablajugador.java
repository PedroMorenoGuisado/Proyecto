package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Movimiento;
import controlador.ControladorJugadores;

public class ModificarTablajugador extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ModificarTablajugador(ArrayList<Movimiento> jugadores){
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(148, 47, 120, 24);
		comboBox.setModel(new DefaultComboBoxModel(jugadores.toArray()));
		panel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton1 = new JButton("Modificar");
		btnNewButton1.setBackground(new Color(255, 153, 0));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Movimiento jugador = (Movimiento) comboBox.getSelectedItem();
				new ControladorJugadores().modificartabla(jugador);
			}
		});
		btnNewButton1.setBounds(168, 121, 89, 23);
		panel.add(btnNewButton1);
	}

}
