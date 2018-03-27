/**
 * 
 */
package ejercicioBluemix01;

/**
 *2. Programa java que realice lo siguiente: 
 * declarar dos variables X e Y de tipo int, 
 * dos variables N y M de tipo double y 
 * asigna a cada una un valor. 
 * A continuación reliza y muestra por pantalla 
 * una serie de operaciones entre ellas.
 *
 */
public class EjercicioBluemix02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int X = 43;
		int Y = 29;
		double N = 3.1542;
		double M = 7.2511;
		
		double suma = X + M;
		int mult = X * Y;
		double operacion = ((Y-N)/M) * N ;
		int resto = X % Y;
		
		System.out.println(suma);
		System.out.println(mult);
		System.out.println(operacion);
		System.out.println(resto);
		//string.format()

	}

}
