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
				"INSERT INTO tablajugadores (nombre, victorias, empates, derrotas, Fechadecreación, Tiempodejuego, jugado, Nºdeturnos) VALUES ('"+
				nombre+"', '"+victorias+"', '"+empates+"', '"+derrotas+"', '"+Fechadecreación+"', '"+Tiempodejuego+"', '"+jugado+"', '"+Nºdeturnos+"');"
			);
		}
	public ArrayList<Movimiento> mostrarMovimiento(){
		// TODO: Hacer_la_petición_a_BBDD_para_recoger_los_alumnos
		ArrayList<Movimiento> jugador = new ArrayList<Movimiento>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM tablajugadores;");
		try {
			String nombre = resultado.getString("Nombre");
			int victorias = resultado.getInt("Victorias");
			int derrotas = resultado.getInt("Derrotas");
			int empates = resultado.getInt("Empates");
			int Fechadecreación = resultado.getInt("Fechadecreacion");
			int Tiempodejuego = resultado.getInt("Tiempodejuego");
			int jugado = resultado.getInt("Jugado");
			int Nºdeturnos = resultado.getInt("Nºdeturnos");
			while(resultado.next()) {
				jugador.add(new Movimiento(nombre, victorias, derrotas, empates, Fechadecreación, Tiempodejuego, jugado, Nºdeturnos));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jugador;
	}
	public void borrarMovimientos(Movimiento jugador) {
		// Recoger_los_datos_requeridos_de_la_variable_jugador
		String nombre = jugador.getNombre();
		// Crear_sentencia_para_eliminar_en_BBDD
		Conexion.ejecutarUpdate(
			"DELETE FROM tablajugadores WHERE NOMBRE='"+nombre+"';"
		);
	}
	public void modificarMovimientos(Movimiento jugador) {
		// Recoger_los_datos_requeridos_de_la_variable_jugador
		String nombre = jugador.getNombre();
		// Crear_sentencia_para_modificar_en_BBDD
		Conexion.ejecutarUpdate(
			"UPDATE `tablajugadores` SET `Nombre`='[value-1]';"
		);
	}
}
