
package algopoly.modelos.tablero;

import algopoly.modelos.jugador.Jugador;

public class Carcel implements Casillero {
    public static final Integer POSICION = 5;

	@Override
	public void recibirJugador(Jugador jugador) {
	    jugador.setPosicion(POSICION);
		jugador.encarcelar();
	}

}