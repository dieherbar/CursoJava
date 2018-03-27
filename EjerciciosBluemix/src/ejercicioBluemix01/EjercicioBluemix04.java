/**
 * 
 */
package ejercicioBluemix01;

/**
 * 4. Programa java que declare cuatro variables enteras A 7 , B 5, C 1 y D 3 y 
 * asígnale un valor acada una. 
 * A continuación realiza las instrucciones necesarias para que: 
 * B 5 tome el valor de C, 
 * C 1 tome el valor de A, 
 * A 7 tome el valor de D, 
 * D 3 tome el valor de B.
 *
 */
public class EjercicioBluemix04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A = 1;
		int B = 3;
		int C = 5;
		int D = 7;
		int aux;
				
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);

	}

}
