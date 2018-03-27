/**
 * 
 */
package ejercicioBluemix01;
import java.util.Scanner;
/**
 * 2. Programa Java que lea un nombre y muestre por pantalla: 
 * “Buenos dias nombre_introducido”.
 *
 */
public class Secuencial02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		
		String nombre = tecla.nextLine();
		System.out.println("Buenos dias " + nombre);

	}

}
