/*
 * Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
 * Por ejemplo, 1000 horas deben corresponderse con 5 semanas, 6 días y 16 horas
 */

public class Horas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int semanas, dias, horas = 1000 ;
		final int hsemana = 24 * 7;
		System.out.println(horas + " son ...");
		semanas = horas/hsemana; // cociente
		horas = horas % hsemana; // resto
		dias = horas / 24; //cociente
		horas = horas % 24; //resto
		
		System.out.println(semanas + " semanas");
		System.out.println(dias + " días");
		System.out.println(horas + " horas");
	}

}
