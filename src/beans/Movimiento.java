package beans;

public class Movimiento {
	String Nombre;
	int Fechadecreaci�n;
	int victorias;
	int derrotas;
	int empates;
	int tiempodejuego;
	int jugado;
	int N�deturnos;
	public Movimiento(String nombre, int fechadecreaci�n, int victorias, int derrotas, int empates, int tiempodejuego,
			int jugado, int n�deturnos) {
		super();
		Nombre = nombre;
		Fechadecreaci�n = fechadecreaci�n;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.tiempodejuego = tiempodejuego;
		this.jugado = jugado;
		N�deturnos = n�deturnos;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getFechadecreaci�n() {
		return Fechadecreaci�n;
	}
	public void setFechadecreaci�n(int fechadecreaci�n) {
		Fechadecreaci�n = fechadecreaci�n;
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
	public int getTiempodejuego() {
		return tiempodejuego;
	}
	public void setTiempodejuego(int tiempodejuego) {
		this.tiempodejuego = tiempodejuego;
	}
	public int getJugado() {
		return jugado;
	}
	public void setJugado(int jugado) {
		this.jugado = jugado;
	}
	public int getN�deturnos() {
		return N�deturnos;
	}
	public void setN�deturnos(int n�deturnos) {
		N�deturnos = n�deturnos;
	}
	public static void add(Movimiento movimiento) {
		// TODO Auto-generated method stub
		
	}
	
}
