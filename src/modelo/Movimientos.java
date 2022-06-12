package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.EstadisticaJugador;
import beans.Movimiento;

public class Movimientos {
		public void guardarMovimiento(Movimiento movimiento) {
			// Recoger los datos requeridos de la varaible jugador
			String nombre = movimiento.getNombre();
			int victorias = movimiento.getVictorias();
			int empates = movimiento.getEmpates();
			int derrotas = movimiento.getDerrotas();
			int Fechadecreación = movimiento.getFechadecreación();
			int Tiempodejuego = movimiento.getTiempodejuego();
			int jugado = movimiento.getJugado();
			int Nºdeturnos = movimiento.getNºdeturnos();
			// Crear sentencia para insertar en BBDD
			Conexion.ejecutarUpdate(
				"INSERT INTO tablajugadores (nombre, victorias, empates, derrotas) VALUES ('"+
				nombre+"', '"+victorias+"', '"+empates+"', '"+derrotas+"', + '"+Fechadecreación+"');"
			);
		}
	public ArrayList<Movimientos> mostrarMovimientos(){
		// TODO: Hacer la petición a BBDD para recoger los alumnos
		ArrayList<Movimiento> jugador = new ArrayList<Movimiento>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM tablajugadores;");
		try {
			String nombre;
			int victorias;
			int derrotas;
			int empates;
			int Fechadecreación;
			while(resultado.next()) {
				movimiento.add(new EstadisticaJugador(nombre, victorias, derrotas, empates, nivel));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movimiento;
	}
}
