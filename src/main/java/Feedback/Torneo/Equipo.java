package Feedback.Torneo;

import java.util.Date;

public class Equipo extends Usuario{

	
	private String nombre;
	private String Patrocinador;
	private String ColorCamiseta1;
	private String ColorCamiseta2;
	private String Categoria;
	



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPatrocinador() {
		return Patrocinador;
	}


	public void setPatrocinador(String patrocinador) {
		Patrocinador = patrocinador;
	}


	public String getColorCamiseta1() {
		return ColorCamiseta1;
	}


	public void setColorCamiseta1(String colorCamiseta1) {
		ColorCamiseta1 = colorCamiseta1;
	}


	public String getColorCamiseta2() {
		return ColorCamiseta2;
	}


	public void setColorCamiseta2(String colorCamiseta2) {
		ColorCamiseta2 = colorCamiseta2;
	}


	public String getCategoria() {
		return Categoria;
	}


	public void setCategoria(String categoria) {
		Categoria = categoria;
	}


	public Equipo(String nombre, String contraseña, String dNI, String direccion, String telefono, Date fechaNacimiento,
			String nombre2, String patrocinador, String colorCamiseta1, String colorCamiseta2, String categoria) {
		super(nombre, contraseña, dNI, direccion, telefono, fechaNacimiento);
		nombre = nombre2;
		Patrocinador = patrocinador;
		ColorCamiseta1 = colorCamiseta1;
		ColorCamiseta2 = colorCamiseta2;
		Categoria = categoria;
	}
}
