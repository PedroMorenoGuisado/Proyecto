package beans;

public class Jugador {
	String nombre;
	int victorias;
	int derrotas;
	int empates;
	int total;
	String nivel;
	public Jugador(String nombre, int victorias, int derrotas, int empates, int total, String nivel) {
		super();
		this.nombre = nombre;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.total = total;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", victorias=" + victorias + ", derrotas=" + derrotas + ", empates="
				+ empates + ", total=" + total + ", nivel=" + nivel + "]";
	}
	
	
}
