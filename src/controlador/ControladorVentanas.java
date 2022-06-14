package controlador;

import vistas.Formulario;
import vistas.TablaJugadores;

import java.util.ArrayList;

import beans.EstadisticaJugador;
import vistas.Boton;
import vistas.TablaJugadores2;
import vistas.TablaJugadores3;

public class ControladorVentanas {
	public void abrirFormulario() {
		new Formulario();
	}
	
	public void abrirTablaJugadores() {
		new TablaJugadores();
	}
	public void abrirBoton() {
		new Boton();
	}
	public void abrirTablaJugadores2() {
		ArrayList<EstadisticaJugador> jugadores = new ControladorJugadores().actualizarEstadisticas();
		new TablaJugadores2(jugadores);
	}
	
	public void abrirTablaJugadores3() {
		ArrayList<EstadisticaJugador> jugadores = new ControladorJugadores().actualizarEstadisticas();
		new TablaJugadores3(jugadores);
	}
}
