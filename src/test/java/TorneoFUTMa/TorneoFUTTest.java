package TorneoFUTMa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Feedback.Torneo.Jugador;
import Feedback.Torneo.TrabajadorFederacion;

public class TorneoFUTTest {
	@Test
	public void RegistrarJugador() {
	
		Jugador unJugador = new Jugador("Miguel", "Miguel123", "47322974F", "calle fra de luis", null, null, null, 10, null, null);
		TrabajadorFederacion.RegistrarJugador("Miguel");
		assertEquals(true,RegistrarJugador(unJugador));
		
	}

	private Object RegistrarJugador(Jugador unJugador) {
		// TODO Auto-generated method stub
		return true;
	}
}


