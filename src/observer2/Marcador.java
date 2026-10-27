package observer2;

public class Marcador implements Observer{

	@Override
	public void actualizarPuntos(int puntuacion) {
		System.out.println("Puntos actuales: "+puntuacion);
		
	}

}
