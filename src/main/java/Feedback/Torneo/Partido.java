package Feedback.Torneo;

public class Partido {


	private String EquipoLocal;
	private String EquipoVisitante;
	private String Campo;
	private String Arbitro;
	
	
	
	public String getEquipoLocal() {
		return EquipoLocal;
	}



	public void setEquipoLocal(String equipoLocal) {
		EquipoLocal = equipoLocal;
	}



	public String getEquipoVisitante() {
		return EquipoVisitante;
	}



	public void setEquipoVisitante(String equipoVisitante) {
		EquipoVisitante = equipoVisitante;
	}



	public String getCampo() {
		return Campo;
	}



	public void setCampo(String campo) {
		Campo = campo;
	}



	public String getArbitro() {
		return Arbitro;
	}



	public void setArbitro(String arbitro) {
		Arbitro = arbitro;
	}



	public Partido(String equipoLocal, String equipoVisitante, String campo, String arbitro) {
		super();
		EquipoLocal = equipoLocal;
		EquipoVisitante = equipoVisitante;
		Campo = campo;
		Arbitro = arbitro;
	}



}
