/*
 * Construir una clase Racional con:
 * Atributos
 * numerador: de tipo double
 * denominador: de tipo double
 * Métodos:
 * public void asignar(double x, double y)
 * public void asignaNumerador(int x)
 * Public void asignaDenominador(int y)
 * public void imprimir()
 * public String toString()
 * public void Simplificar()
 * public void sumar(Racional b)
 * public void sumar(Racional a, Racional b)
 * public void producto(Racional a, Racional b)
 * Construir una clase PruebaRacional que contenga un método principal que trabaje con instancias de la clase Racional.
 */

public class Racional {
	public int numerador, denominador;
	
	public void asignar(int x, int y) {
		numerador = x;
		denominador = y;
	}
	
	public void asignaNumerador(int x) {
		numerador = x;
	}
	
	public void asignaDenominador(int y) {
		denominador = y;
	}
	
	public void imprimir(){
		System.out.println("La fraccion es ");
	}
	
	
	public String toString() {
		return numerador + " / " + denominador;
	}
	
	public void sumar(Racional r){
		int nuevoNumerador = 0;
		int nuevoDenominador = 0;
		nuevoNumerador = this.numerador * r.denominador + this.denominador * r.numerador; // this para acceder a atributo (no es obligatorio en java)
		nuevoDenominador = denominador * r.denominador;
		numerador = nuevoNumerador;
		denominador = nuevoDenominador;
		simplificar();
	}
	
	// método que devuelve el máximo común divisor de dos números
	private static int gcd(int a, int b) {
		if (b==0) {
			return a;
		}
		int r = a % b;
		return gcd(b, r);
	}
	
	
	public void simplificar() {
		int divisor = gcd(numerador, denominador);
		numerador = numerador / divisor;
		denominador = denominador / divisor;
	}
	
	
	

}
