/*
 * Programa que calcula el volumen y la superficie de una esfera dado su radio 
 */

/**
 * @author Alumno
 *
 */
public class Esfera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radio;
		double superficie, volumen;
		final double PI = 3.141592;
		radio = 10;
		
		// Calcular superficie
		superficie = 4 * PI * radio * radio;
		
		// Calcular volumen
		volumen = 4/3 * PI * radio*radio*radio;
		
		// Mostramos los resultados
		System.out.println("Dimensiones de la esfera de radio " + radio);
		System.out.println("Superficie: " + superficie);
		System.out.println("Volumen: " + volumen);
	}

}
