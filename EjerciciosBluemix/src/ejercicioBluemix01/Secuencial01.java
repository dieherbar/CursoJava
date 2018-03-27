/**
 * 
 */
package ejercicioBluemix01;

import java.util.Scanner;

/**
 * 1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 *
 */
public class Secuencial01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		
		System.out.println("Primer valor " + A);
		System.out.println("Segundo valor " + B);

	}

}
