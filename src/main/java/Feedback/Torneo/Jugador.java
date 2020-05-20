package Feedback.Torneo;


import java.util.Date;


public class Jugador extends Usuario{


	private String nombre;
	private int Dorsal;
	private String Estadisticas;
	private String Sanciones;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getDorsal() {
		return Dorsal;
	}



	public void setDorsal(int dorsal) {
		Dorsal = dorsal;
	}



	public String getEstadisticas() {
		return Estadisticas;
	}



	public void setEstadisticas(String estadisticas) {
		Estadisticas = estadisticas;
	}



	public String getSanciones() {
		return Sanciones;
	}



	public void setSanciones(String sanciones) {
		Sanciones = sanciones;
	}



	public Jugador(String nombre, String contraseña, String dNI, String direccion, String telefono,
			Date fechaNacimiento, String nombre2, int dorsal, String estadisticas, String sanciones) {
		super(nombre, contraseña, dNI, direccion, telefono, fechaNacimiento);
		nombre = nombre2;
		Dorsal = dorsal;
		Estadisticas = estadisticas;
		Sanciones = sanciones;
	}
	
	
	
}
