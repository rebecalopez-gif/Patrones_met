package observer2;

public class Main {

	public static void main(String[] args) {
		 Jugador jugador = new Jugador();

	        Marcador marcador = new Marcador();
	        Sistemaestadistica e = new Sistemaestadistica();

	        jugador.anadirObservador(marcador);
	        jugador.anadirObservador(e);

	        jugador.setPuntuacion(10);
	        jugador.setPuntuacion(25);
	        jugador.setPuntuacion(40);

	}

}
