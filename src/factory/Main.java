package factory;

public class Main {

	public static void main(String[] args) {
		
		Notificacion notificacion=Notificacionfactory.crear("sms");
		
		notificacion.enviar();
		
	}

}
