package beans;

public class Movimiento {
	String Nombre;
	int Fechadecreación;
	int victorias;
	int derrotas;
	int empates;
	int tiempodejuego;
	int jugado;
	int Nºdeturnos;
	public Movimiento(String nombre, int fechadecreación, int victorias, int derrotas, int empates, int tiempodejuego,
			int jugado, int nºdeturnos) {
		super();
		Nombre = nombre;
		Fechadecreación = fechadecreación;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.tiempodejuego = tiempodejuego;
		this.jugado = jugado;
		Nºdeturnos = nºdeturnos;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getFechadecreación() {
		return Fechadecreación;
	}
	public void setFechadecreación(int fechadecreación) {
		Fechadecreación = fechadecreación;
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
	public int getNºdeturnos() {
		return Nºdeturnos;
	}
	public void setNºdeturnos(int nºdeturnos) {
		Nºdeturnos = nºdeturnos;
	}
	public static void add(Movimiento movimiento) {
		// TODO Auto-generated method stub
		
	}
	
}
