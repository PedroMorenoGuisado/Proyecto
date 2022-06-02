package main;

import bbdd.Conexion;
import vistas.Inicio;

public class Main {
	public static void main(String[] args) {
		Conexion.conectar();
		new Inicio();
	}
}
