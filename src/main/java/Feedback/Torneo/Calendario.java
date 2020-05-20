package Feedback.Torneo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Calendario {

	
	
	private List<Partido> ListaPartidos;
	private Date Fecha;

	public Date getFecha() {
		return Fecha;
	}
	
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Calendario(Date fecha) {
		super();
		Fecha = fecha;
	
	}
	
	public void RegistrarPartido(Partido Partido) {
	ListaPartidos = new ArrayList<>();
	
	ListaPartidos.add(Partido);
	
	}
	
}
