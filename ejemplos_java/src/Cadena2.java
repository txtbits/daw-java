/*
 * Construir un programa que pida la introducci�n de una cadena de caracteres por teclado y cuente y visualice por pantalla el n�mero de caracteres 'a' y 'A' que contiene.
 */
public class Cadena2 {
	
	public static void cuentaA(String c){
		// Imprime el n�mero de a, A.
		int contador = 0;
		for (int i=0; i< c.length(); i++){
			if (c.charAt(i) == 'a' || c.charAt(i) == 'A' || c.charAt(i) == '�' || c.charAt(i) == '�'){
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
		cadena = new String ("Hola que tal cApull�");
		cuentaA(cadena);
	}

}
