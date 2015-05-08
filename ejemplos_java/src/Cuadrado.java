/*
 * Ejercicio condicionales
 * Usa args para ver si se esta usando con parámetros ...
 */
public class Cuadrado {
  public static void main (String [] args) {
    int valor1, valor2;
    if (args.length < 2) {
       System.out.println("Error, introduce dos valores");
       }
       else {
       valor1 = Integer.parseInt(args[0]);
       valor2 = Integer.parseInt(args[1]);
       System.out.println("El producto es " + valor1*valor2);
    }
  }
}
