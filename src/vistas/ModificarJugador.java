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

public class ModificarJugador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(142, 217, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 39, 75, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("victorias");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(49, 69, 75, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("empates");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(49, 94, 75, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("derrotas");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(49, 116, 75, 29);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Nivel");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(49, 168, 74, 20);
		panel.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(277, 38, 120, 24);
		comboBox.setModel(new DefaultComboBoxModel(jugadores.toArray()));
		panel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton1 = new JButton("Modificar");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstadisticaJugador jugador = (EstadisticaJugador) comboBox.getSelectedItem();
				new ControladorJugadores().modificar(jugador);
			}
		});
		btnNewButton1.setBounds(297, 82, 89, 23);
		panel.add(btnNewButton1);
		
		textField = new JTextField();
		textField.setBounds(145, 40, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 70, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 95, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(145, 120, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JSpinner campoNivel = new JSpinner();
		campoNivel.setModel(new SpinnerListModel(new String[] {"Principiante", "Aficionado", "Profesional", "Clase Mundial", "Leyenda"}));
		campoNivel.setBounds(142, 168, 107, 20);
		panel.add(campoNivel);
	}
}