/*
 * Construir un programa que simule el juego de la adivinanza de un número. El ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene cinco oportunidades 
 * para acertarlo. Después de cada intento el programa debe indicarle al usuario si el número introducido por él es mayor, menor o igual al número a adivinar.
 */

import java.util.Scanner;


public class Adivinanza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in;
		int numero, max = 100, min = 1, intentos = 0; 
		int oculto = (int) (100* Math.random()+1);
		// System.out.println("el numero es: " + oculto);
		in = new Scanner(System.in);
		
		
		do {
			System.out.println("Introduce un numero entre " + min + " y " + max);
			numero = in.nextInt();
			if (numero < oculto) {
				if (numero > min)
					min = numero + 1;
				System.out.println("El numero oculto es mayor");
			}
			else if (numero > oculto){
				if (numero < max)
					max = numero - 1;
				System.out.println("El numero oculto es menor");
			}
			
			intentos ++;
			} while (oculto != numero && intentos < 5);
			
		if (numero == oculto)
			System.out.println("Has adivinado el número oculto");
		else {
			System.out.println("\n¡Has perdido!");
			System.out.println("El número oculto era: " + oculto);
		}
		
			
			
			
	}

}
