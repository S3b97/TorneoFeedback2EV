package Feedback.Torneo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrabajadorFederacion extends Usuario{

	
	
	
	private String nombre;
	private String contrase�a;
	private String DNI;
	private List<Jugador> jugadores;
	
	public TrabajadorFederacion(String nombre, String contrase�a, String dNI, String direccion, String telefono,
			Date fechaNacimiento, String nombre2, String contrase�a2, String dNI2, List jugadores) {
		super(nombre, contrase�a, dNI, direccion, telefono, fechaNacimiento);
		nombre = nombre2;
		contrase�a = contrase�a2;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
