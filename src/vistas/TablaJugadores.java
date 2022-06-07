package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Jugador;
import controlador.ControladorJugadores;
import modelo.ModeloJugador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
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

public class TablaJugadores extends JFrame {

	private JPanel contentPane;
	private JTextField campoNombre;


	public TablaJugadores() {
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
		
		campoNombre = new JTextField();
		campoNombre.setBounds(142, 40, 107, 20);
		panel.add(campoNombre);
		campoNombre.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nivel");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(49, 168, 74, 20);
		panel.add(lblNewLabel_5);
		
		JSpinner campoVictorias = new JSpinner();
		campoVictorias.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
		campoVictorias.setBounds(142, 70, 107, 20);
		panel.add(campoVictorias);
		
		JSpinner campoEmpates = new JSpinner();
		campoEmpates.setBounds(142, 95, 107, 20);
		panel.add(campoEmpates);
		
		JSpinner CampoDerrotas = new JSpinner();
		CampoDerrotas.setBounds(142, 120, 107, 20);
		panel.add(CampoDerrotas);
		
		JSpinner campoNivel = new JSpinner();
		campoNivel.setModel(new SpinnerListModel(new String[] {"Principiante", "Aficionado", "Profesional", "Clase Mundial", "Leyenda"}));
		campoNivel.setBounds(142, 168, 107, 20);
		panel.add(campoNivel);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Recoger los datos del formulario (de los inputText)
				String nombre = campoNombre.getText();
				int victorias = (int) campoVictorias.getValue();
				int empates = (int) campoEmpates.getValue();
				int derrotas = (int) CampoDerrotas.getValue();
				String nivel = campoNivel.getToolTipText();
				// Montar un objeto jugador
				Jugador jugador = new Jugador(nombre, victorias, empates, derrotas, nivel);
				// Llamar al controlador mandando el objeto jugador
				new ControladorJugadores().guardarJugador(jugador);
				
			}
		});
	}
}
