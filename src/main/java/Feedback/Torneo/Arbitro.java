package Feedback.Torneo;

import java.util.Date;

public class Arbitro extends Usuario{

	
	private String nombre;
	private String DNI;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public Arbitro(String nombre, String contraseña, String dNI, String direccion, String telefono,
			Date fechaNacimiento, String nombre2, String dNI2) {
		super(nombre, contraseña, dNI, direccion, telefono, fechaNacimiento);
		
		nombre = nombre2;
		DNI = dNI2;
	}



}
