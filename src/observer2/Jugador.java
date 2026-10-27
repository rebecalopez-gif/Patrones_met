package observer2;

import java.util.ArrayList;

public class Jugador {
	private int puntuacion;
	private ArrayList <Observer> observadores=new ArrayList<Observer>();
	
	public Jugador() {
		this.puntuacion=0;
	}
	
	public void anadirObservador(Observer o) {
		observadores.add(o);
	}
	
	public void eliminarObservador(Observer o) {
		observadores.remove(o);;
	}
	
	public void notificar() {
		for(Observer o:observadores) {
			o.actualizarPuntos(puntuacion);
		}
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
		notificar();
	}

	public ArrayList<Observer> getObservadores() {
		return observadores;
	}

	public void setObservadores(ArrayList<Observer> observadores) {
		this.observadores = observadores;
		notificar();
	}
	
	
}
