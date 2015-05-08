/*
 * Construir un programa que pida la introducción de una cadena de caracteres por teclado y cuente y visualice por pantalla el número de caracteres 'a' y 'A' que contiene.
 */
public class Cadena2 {
	
	public static void cuentaA(String c){
		// Imprime el número de a, A.
		int contador = 0;
		for (int i=0; i< c.length(); i++){
			if (c.charAt(i) == 'a' || c.charAt(i) == 'A' || c.charAt(i) == 'á' || c.charAt(i) == 'Á'){
				contador++;
			}
		}
		System.out.println("La cadena \"" + c + "\" tiene " + contador + " aes." );
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		cadena = new String ("Hola que tal cApullá");
		cuentaA(cadena);
	}

}
