package controlador;

import beans.Jugador;
import modelo.ModeloJugador;

public class ControladorJugadores {

	public void guardarJugador(Jugador jugador) {
		new ModeloJugador().guardarJugador(jugador);
	}
	
}
