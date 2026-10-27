package observer;

public class Main {

	public static void main(String[] args) {
		Termometro termometro=new Termometro();
		termometro.suscribir(new Pantalla());
		termometro.suscribir(new Alarma());

		termometro.nuevaTemperatura("31");
		termometro.nuevaTemperatura("29");
	}

}
