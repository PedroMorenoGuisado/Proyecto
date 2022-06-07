package modelo;

import bbdd.Conexion;
import beans.Jugador;

public class ModeloJugador {

	public void guardarJugador(Jugador jugador) {
		// Recoger los datos requeridos de la varaible jugador
		String nombre = jugador.getNombre();
		int victorias = jugador.getVictorias();
		int empates = jugador.getEmpates();
		int derrotas = jugador.getDerrotas();
		String nivel = jugador.getNivel();
		// Crear sentencia para insertar en BBDD
		Conexion.ejecutarUpdate("INSERT INTO tablajugadores (nombre, victorias, empates, derrotas, nivel) VALUES ('"+nombre+"', '"+victorias+"', '"+empates+"', '"+derrotas+"', '"+nivel+"');");
	}

}
