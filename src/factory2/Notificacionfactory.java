package factory2;

public class Notificacionfactory {
	public static Notificacion crear(String tipo) {
		if(tipo.equals("tarjeta")) {
			return new Tarjeta();
		} else if(tipo.equals("paypal")) {
			return new Paypal();
		}else {
			throw new IllegalArgumentException("null");
		}
		
	}
}
