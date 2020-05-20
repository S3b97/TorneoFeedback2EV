package Feedback.Torneo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrabajadorFederacion extends Usuario{

	
	
	
	private String nombre;
	private String contraseña;
	private String DNI;
	private List<Jugador> jugadores;
	
	public TrabajadorFederacion(String nombre, String contraseña, String dNI, String direccion, String telefono,
			Date fechaNacimiento, String nombre2, String contraseña2, String dNI2, List jugadores) {
		super(nombre, contraseña, dNI, direccion, telefono, fechaNacimiento);
		nombre = nombre2;
		contraseña = contraseña2;
		DNI = dNI2;
		jugadores = new ArrayList<>();
		
	}

	public boolean RegistrarJugador(Jugador Jugador) {
	for (Jugador unJugador : jugadores) {
		if (unJugador.getNombre().equals(Jugador.getNombre()))	
		return false;
	}

	jugadores.add(Jugador);	
	return true;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public static void RegistrarJugador(String string) {
		// TODO Auto-generated method stub
		
	}
}
