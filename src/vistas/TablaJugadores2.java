package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.EstadisticaJugador;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class TablaJugadores2 extends JFrame {

	private JPanel contentPane;
	private JTextField campoNombre;
	private JTable table;


	public TablaJugadores2(ArrayList<EstadisticaJugador> jugadores) {
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
		
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);		
		table.setBounds(10, 11, 404, 229);
		panel.add(table);
		contentPane.add(table, BorderLayout.CENTER);
		/* Crear las columnas */
		dtm.addColumn("Nombre");
		dtm.addColumn("Victorias");
		dtm.addColumn("Derrotas");
		dtm.addColumn("Empates");
		dtm.addColumn("Nivel");
		/* Rellenar los datos con el array de alumnos */
		for(EstadisticaJugador jugador : jugadores) {
			Object[] fila = new Object[5];
			fila[0] = jugador.getNombre();
			fila[1] = jugador.getVictorias();
			fila[2] = jugador.getDerrotas();
			fila[3] = jugador.getEmpates();
			fila[4] = jugador.getNivel();
			dtm.addRow(fila);		
		}
	}
}
