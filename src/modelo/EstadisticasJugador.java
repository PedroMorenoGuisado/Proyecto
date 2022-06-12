package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.EstadisticaJugador;

public class EstadisticasJugador {
	public void guardarEstadisticasJugador(EstadisticaJugador jugador) {
		// Recoger_los_datos_requeridos_de_la_variable_jugador
		String nombre = jugador.getNombre();
		int victorias = jugador.getVictorias();
		int empates = jugador.getEmpates();
		int derrotas = jugador.getDerrotas();
		String nivel = jugador.getNivel();
		// Crear_sentencia_para_insertar_en_BBDD
		Conexion.ejecutarUpdate(
			"INSERT INTO niveles (nombre, victorias, empates, derrotas) VALUES ('"+
			nombre+"', '"+victorias+"', '"+empates+"', '"+derrotas+"');"
		);
	}
	
	public ArrayList<EstadisticaJugador> mostrarEstadisticas(){
		// TODO: Hacer_la_petición_a_BBDD_para_recoger_los_alumnos
		ArrayList<EstadisticaJugador> jugador = new ArrayList<EstadisticaJugador>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM niveles;");
		try {
			String nombre = null;
			int victorias = 0;
			int derrotas = 0;
			int empates = 0;
			String nivel = null;
			while(resultado.next()) {
				jugador.add(new EstadisticaJugador(nombre, victorias, derrotas, empates, nivel));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jugador;
	}
	
}
