package controlador;

import beans.EstadisticaJugador;
import modelo.EstadisticasJugador;

public class ControladorJugadores {

	public void guardarEstadisticasJugador(EstadisticaJugador jugador) {
		new EstadisticasJugador().guardarEstadisticasJugador(jugador);
	}
	
}
