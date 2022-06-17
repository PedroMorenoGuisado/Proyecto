package controlador;

import vistas.Formulario;
import vistas.ModificarJugador;
import vistas.CrearJugadores;

import java.util.ArrayList;

import beans.EstadisticaJugador;
import vistas.Boton;
import vistas.TablaBBDD;
import vistas.EliminarJugadores;

public class ControladorVentanas {
	public void abrirFormulario() {
		new Formulario();
	}
	
	public void abrirCrearJugadores() {
		new CrearJugadores();
	}
	public void abrirBoton() {
		new Boton();
	}
	public void abrirTablaBBDD() {
		ArrayList<EstadisticaJugador> jugadores = new ControladorJugadores().actualizarEstadisticas();
		new TablaBBDD(jugadores);
	}
	
	public void abrirEliminarJugadores() {
		ArrayList<EstadisticaJugador> jugadores = new ControladorJugadores().actualizarEstadisticas();
		new EliminarJugadores(jugadores);
	}

	public void abrirModificarJugador() {
		ArrayList<EstadisticaJugador> jugadores = new ControladorJugadores().actualizarEstadisticas();
		new ModificarJugador(jugadores);
		
	}
}
