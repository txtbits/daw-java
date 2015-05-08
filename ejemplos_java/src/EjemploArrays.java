
public class EjemploArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] enteros;
		enteros = new int[10];
		double [] raices;
		raices = new double[10];
		// Inicializar array
		for (int i=0; i<enteros.length; i++){
			enteros[i] = i+1;
			raices[i] = Math.sqrt(enteros[i]);
		}
		// Imprimir array
		for (int i=0; i<enteros.length; i++){
			System.out.print("Posición: " + i + " ---> " + enteros[i]);
			System.out.format(" Raíz: %6.2f\n", raices[i]);
		}
	}
}
