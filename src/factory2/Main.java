package factory2;

public class Main {

	public static void main(String[] args) {
		
		Notificacion notificacion=Notificacionfactory.crear("paypal"); //poner tarjeta o paypal
		
		notificacion.realizarPago();
		
	}

}
