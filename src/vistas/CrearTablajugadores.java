package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.EstadisticaJugador;
import beans.Movimiento;
import controlador.ControladorJugadores;
import controlador.ControladorVentanas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class CrearTablajugadores extends JFrame{
	private JPanel contentPane;
	private JTextField campoNombre;


	public CrearTablajugadores() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(142, 217, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 22, 75, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("victorias");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(49, 47, 75, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("empates");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(49, 100, 75, 11);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("derrotas");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(49, 120, 75, 14);
		panel.add(lblNewLabel_3);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(142, 23, 107, 14);
		panel.add(campoNombre);
		campoNombre.setColumns(10);
		
		JSpinner campoVictorias = new JSpinner();
		campoVictorias.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
		campoVictorias.setBounds(142, 47, 100, 14);
		panel.add(campoVictorias);
		
		JSpinner campoEmpates = new JSpinner();
		campoEmpates.setBounds(142, 72, 100, 14);
		panel.add(campoEmpates);
		
		JSpinner CampoDerrotas = new JSpinner();
		CampoDerrotas.setBounds(142, 98, 100, 14);
		panel.add(CampoDerrotas);
		
		JButton btnNewButton2 = new JButton("Eliminar jugador");
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton2.setForeground(Color.BLACK);
		btnNewButton2.setBackground(new Color(255, 140, 0));
		btnNewButton2.setBounds(284, 11, 130, 23);
		panel.add(btnNewButton2);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.setBackground(new Color(255, 153, 0));
		btnNewButton_1.setBounds(301, 94, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Fechadecreacion");
		lblNewLabel_4.setBounds(44, 145, 89, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("jugado");
		lblNewLabel_5.setBounds(69, 170, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("N\u00BAdeturmos");
		lblNewLabel_6.setBounds(58, 195, 75, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Tiempodejuego");
		lblNewLabel_7.setBounds(49, 73, 75, 14);
		panel.add(lblNewLabel_7);
		
		JSpinner CampoFechadecreacion = new JSpinner();
		CampoFechadecreacion.setBounds(142, 120, 100, 14);
		panel.add(CampoFechadecreacion);
		
		JSpinner CampoJugado = new JSpinner();
		CampoJugado.setBounds(142, 145, 100, 14);
		panel.add(CampoJugado);
		
		JSpinner CampoNºdeturnos = new JSpinner();
		CampoNºdeturnos.setBounds(142, 170, 100, 14);
		panel.add(CampoNºdeturnos);
		
		JSpinner CampoTiempodejuego = new JSpinner();
		CampoTiempodejuego.setBounds(142, 195, 100, 14);
		panel.add(CampoTiempodejuego);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ControladorVentanas().abrirModificarJugador();
			}
		});
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ControladorVentanas().abrirEliminarJugadores();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Recoger los datos del formulario (de los inputText)
				String nombre = campoNombre.getText();
				int victorias = (int) campoVictorias.getValue();
				int empates = (int) campoEmpates.getValue();
				int derrotas = (int) CampoDerrotas.getValue();
				int Fechadecreacion = (int) CampoFechadecreacion.getValue();
				int jugado = (int) CampoJugado.getValue();
				int Nºdeturnos = (int) CampoNºdeturnos.getValue();
				int Tiempodejuego = (int) CampoTiempodejuego.getValue();
				
				// Montar un objeto jugador
				Movimiento jugador = new Movimiento(nombre, victorias, empates, derrotas, Fechadecreacion, jugado, Nºdeturnos, Tiempodejuego);
				// Llamar al controlador mandando el objeto jugador
				new ControladorJugadores().guardarMovimiento(jugador);
				
			}
		});
	}
}
