package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.EstadisticaJugador;
import beans.Movimiento;

public class Movimientos {
		public void guardarMovimiento(Movimiento movimiento) {
			// Recoger_los_datos_requeridos_de_la_varaible_jugador
			String nombre = movimiento.getNombre();
			int victorias = movimiento.getVictorias();
			int empates = movimiento.getEmpates();
			int derrotas = movimiento.getDerrotas();
			int Fechadecreación = movimiento.getFechadecreación();
			int Tiempodejuego = movimiento.getTiempodejuego();
			int jugado = movimiento.getJugado();
			int Nºdeturnos = movimiento.getNºdeturnos();
			// Crear_sentencia_para_insertar_en_BBDD
			Conexion.ejecutarUpdate(
				"INSERT INTO tablajugadores (nombre, victorias, empates, derrotas, Tiempodejuego, jugado, Nºdeturnos) VALUES ('"+
				nombre+"', '"+victorias+"', '"+empates+"', '"+derrotas+"', + '"+Fechadecreación+"', '"+Tiempodejuego+"', '"+jugado+"', '"+Nºdeturnos+"');"
			);
		}
	public ArrayList<Movimientos> mostrarMovimientos(){
		// TODO: Hacer_la_petición_a_BBDD_para_recoger_los_alumnos
		ArrayList<Movimiento> jugador = new ArrayList<Movimiento>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM tablajugadores;");
		try {
			String nombre;
			int victorias;
			int derrotas;
			int empates;
			int Fechadecreación;
			int Tiempodejuego;
			int jugado;
			int Nºdeturnos;
			while(resultado.next()) {
				Movimiento.add(new Movimiento(nombre, victorias, derrotas, empates, Fechadecreación, Tiempodejuego, jugado, Nºdeturnos));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movimiento;
	}
}
