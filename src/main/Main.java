package main;

import bbdd.Conexion;
import vistas.Inicio;
import vistas.Boton;

public class Main {
	public static void main(String[] args) {
		Conexion.conectar();
		new Inicio();
		
		Boton ventana=new Boton();
		ventana.setBounds(500,250,300,250);
		ventana.setVisible(true);
		ventana.setResizable(false);
		
		try {
			System.out.println("Siguiente mensaje en 1 segundo");
			Thread.sleep(1000);
			System.out.println("Siguiente mensaje en 2 segundos");
			Thread.sleep(2000);
			System.out.println("Siguiente mensaje en 3 segundos");
			Thread.sleep(3000);
			System.out.println("Mensaje Final");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
