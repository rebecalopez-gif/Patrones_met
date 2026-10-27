package observer;

public class Pantalla implements Observador{

	@Override
	public void nuevaTemperatura(String t) {
		System.out.println("Temperatura actual: "+t);
		
	}

}
