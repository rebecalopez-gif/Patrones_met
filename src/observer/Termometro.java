package observer;

import java.util.ArrayList;
import java.util.List;

public class Termometro {
	private List<Observador> observadores=new ArrayList();
	public void suscribir(Observador observador) {
		observadores.add(observador);
	}
	
	public void nuevaTemperatura(String t) {
		System.out.println("Nueva temperatura: "+t);
		
		for(Observador observador:observadores) {
			observador.nuevaTemperatura(t);
			
		}
		
		System.out.println("Se ha registrado la temperatura: "+t);
		
		
	}
	
	
}
