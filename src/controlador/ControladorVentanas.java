package controlador;

import vistas.Formulario;
import vistas.TablaJugadores;
import vistas.Boton;

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
}
