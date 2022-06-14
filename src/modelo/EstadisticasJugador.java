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
			"INSERT INTO niveles (nombre, victorias, empates, derrotas, nivel) VALUES ('"+
			nombre+"', '"+victorias+"', '"+empates+"', '"+derrotas+"', '"+nivel+"');"
		);
	}
	

	public ArrayList<EstadisticaJugador> recogerEstadisticas(){
		// TODO: Hacer_la_petición_a_BBDD_para_recoger_los_alumnos
		ArrayList<EstadisticaJugador> jugador = new ArrayList<EstadisticaJugador>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM niveles;");
		try {
			while(resultado.next()) {
				String nombre = resultado.getString("Nombre");
				int victorias = resultado.getInt("Victorias");
				int derrotas = resultado.getInt("Derrotas");
				int empates = resultado.getInt("Empates");
				String nivel= resultado.getString("nivel");
				
				jugador.add(new EstadisticaJugador(nombre, victorias, derrotas, empates, nivel));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jugador;
	}
}
