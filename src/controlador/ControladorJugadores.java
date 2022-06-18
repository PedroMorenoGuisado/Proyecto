package controlador;

import java.util.ArrayList;

import beans.EstadisticaJugador;
import beans.Movimiento;
import modelo.EstadisticasJugador;
import modelo.Movimientos;

public class ControladorJugadores {

	public void guardarEstadisticasJugador(EstadisticaJugador jugador) {
		new EstadisticasJugador().guardarEstadisticasJugador(jugador);
	}
	public void guardarMovimiento(Movimiento jugador) {
		new Movimientos().guardarMovimiento(jugador);
	}
	
	public ArrayList<EstadisticaJugador> actualizarEstadisticas() {
		ArrayList<EstadisticaJugador> jugador = new EstadisticasJugador().recogerEstadisticas();
		return jugador;
	}
	public ArrayList<Movimiento> actualizarMovimientos() {
		ArrayList<Movimiento> jugador = new Movimientos().mostrarMovimiento();
		return jugador;
	}

	public void eliminar(EstadisticaJugador jugador) {
		new EstadisticasJugador().borrarEstadisticasJugador(jugador);
	}
	public void eliminar(Movimiento jugador) {
		new Movimientos().borrarMovimientos(jugador);
	}
	
	public void modificar(EstadisticaJugador jugador) {
		new EstadisticasJugador().modificarEstadisticasJugador(jugador);
	}
	public void modificartabla(Movimiento jugador) {
		new Movimientos().modificarMovimientos(jugador);
	}
}