package beans;

public class EstadisticaJugador {
	String nombre;
	int victorias;
	int derrotas;
	int empates;
	String nivel;
	public EstadisticaJugador(String nombre, int victorias, int derrotas, int empates, String nivel) {
		super();
		this.nombre = nombre;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return this.nombre;
	}
}
