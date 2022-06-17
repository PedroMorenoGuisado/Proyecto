package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.EstadisticaJugador;
import controlador.ControladorJugadores;

import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarJugadores extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public EliminarJugadores(ArrayList<EstadisticaJugador> jugadores) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(119, 60, 164, 24);
		comboBox.setModel(new DefaultComboBoxModel(jugadores.toArray()));
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstadisticaJugador jugador = (EstadisticaJugador) comboBox.getSelectedItem();
				new ControladorJugadores().eliminar(jugador);
			}
		});
		btnNewButton.setBounds(144, 152, 89, 23);
		panel.add(btnNewButton);
	}
}
