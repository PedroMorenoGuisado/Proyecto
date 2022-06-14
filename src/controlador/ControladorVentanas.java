package controlador;

import vistas.Formulario;
import vistas.TablaJugadores;

import java.util.ArrayList;

import beans.EstadisticaJugador;
import vistas.Boton;
import vistas.TablaJugadores2;

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
}
