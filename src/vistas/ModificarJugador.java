package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import beans.EstadisticaJugador;
import controlador.ControladorJugadores;

import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.Color;

public class ModificarJugador extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ModificarJugador(ArrayList<EstadisticaJugador> jugadores){
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
				EstadisticaJugador jugador = (EstadisticaJugador) comboBox.getSelectedItem();
				new ControladorJugadores().modificar(jugador);
			}
		});
		btnNewButton1.setBounds(168, 121, 89, 23);
		panel.add(btnNewButton1);
	}
}