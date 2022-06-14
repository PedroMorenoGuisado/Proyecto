package controlador;

import java.util.ArrayList;

import beans.EstadisticaJugador;
import modelo.EstadisticasJugador;

public class ControladorJugadores {

	public void guardarEstadisticasJugador(EstadisticaJugador jugador) {
		new EstadisticasJugador().guardarEstadisticasJugador(jugador);
	}
	
	public ArrayList<EstadisticaJugador> actualizarEstadisticas() {
		ArrayList<EstadisticaJugador> jugador = new EstadisticasJugador().recogerEstadisticas();
		return jugador;
	}
	
}