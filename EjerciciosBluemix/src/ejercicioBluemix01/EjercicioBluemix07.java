/**
 * 
 */
package ejercicioBluemix01;

/**
 * 7. Programa Java que declare una variable C de tipo entero y asígnale un valor. 
 * A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, 
 * si es par o impar, 
 * si es múltiplo de 5, 
 * si es múltiplo de 10 y 
 * si es mayor o menor que 100. Consideraremos el 0 como positivo. 
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 *
 */
public class EjercicioBluemix07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int C = 90;
		
		System.out.println(C < 0? "negativo":"positivo");
		System.out.println(C % 2==0? "par":"impar");
		System.out.println(C % 5==0? "multiplo de 5":"no multiplo");
		System.out.println(C % 10==0? "multiplo de 10":"no multiplo");
		System.out.println(C > 100? "mayor a 100":"menor a 100");
	}

}
