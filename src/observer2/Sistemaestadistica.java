package observer2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sistemaestadistica implements Observer{

	@Override
	public void actualizarPuntos(int puntuacion) {
		System.out.println("Registrando puntuación... "+puntuacion);
		
		try {
            FileWriter fw = new FileWriter("estadisticas.txt", true); // true = append
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Puntuación registrada: " + puntuacion);

            pw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
		
		
	}

}
