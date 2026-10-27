package observer;

public class Alarma implements Observador{

	@Override
	public void nuevaTemperatura(String t) {
		if (Integer.parseInt(t) > 30) {
		    System.out.println("Ha superado la temperatura.");
		}
		
	}

	

}
