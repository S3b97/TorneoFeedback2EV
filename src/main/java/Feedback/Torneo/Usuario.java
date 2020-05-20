package Feedback.Torneo;

import java.util.Date;

public class Usuario {

	private String nombre;
	private String contrase�a;
	private String DNI;
	private String direccion;
	private String telefono;
	private Date FechaNacimiento;
	
	
	public Usuario(String nombre, String contrase�a, String dNI, String direccion, String telefono,
			Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		DNI = dNI;
		this.direccion = direccion;
		this.telefono = telefono;
		FechaNacimiento = fechaNacimiento;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

}



