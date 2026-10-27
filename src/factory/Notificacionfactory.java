package factory;

public class Notificacionfactory {
	public static Notificacion crear(String tipo) {
		if(tipo.equals("email")) {
			return new Email();
		} else if(tipo.equals("sms")) {
			return new Sms();
		}else {
			throw new IllegalArgumentException("null");
		}
		
	}
}
