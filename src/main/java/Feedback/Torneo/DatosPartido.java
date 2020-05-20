package Feedback.Torneo;

public class DatosPartido {

	
	private String Incidencias;
	private String Resultado;
	private String Expulsado;
	
	
	
	public String getIncidencias() {
		return Incidencias;
	}



	public void setIncidencias(String incidencias) {
		Incidencias = incidencias;
	}



	public String getResultado() {
		return Resultado;
	}



	public void setResultado(String resultado) {
		Resultado = resultado;
	}



	public String getExpulsado() {
		return Expulsado;
	}



	public void setExpulsado(String expulsado) {
		Expulsado = expulsado;
	}



	public DatosPartido(String incidencias, String resultado, String expulsado) {
		super();
		Incidencias = incidencias;
		Resultado = resultado;
		Expulsado = expulsado;
	}

}
