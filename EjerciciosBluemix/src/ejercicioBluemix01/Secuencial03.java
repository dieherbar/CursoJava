/**
 * 
 */
package ejercicioBluemix01;

import java.util.Scanner;

/**
 * 3. Programa Java que lee un n�mero entero por teclado y 
 * obtiene y muestra por pantalla 
 * el doble y 
 * el triple de ese n�mero.

 *
 */
public class Secuencial03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		
		int numero = tecla.nextInt();;
		//numero = tecla.nextInt();
		System.out.println("El doble es " + numero * 2);
		System.out.println("El triple es " + numero * 3);
	}

}
