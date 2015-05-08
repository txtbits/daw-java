/*
 * Ejercicio conversiones
 * Usa conversiones expl�citas con cast
 */

public class Conversiones {
  public static void main (String [] args) {
    int a = 2;
    double b = 3.0;
    float c = (float) (20000*a/b + 5); // conversi�n a float de int*double
    System.out.println("Valor en formato float:  " + c); 
    System.out.println("Valor en formato double: " + (double) c);
    System.out.println("Valor en formato byte:   " + (byte) c);
    System.out.println("Valor en formato short:  " + (short) c);
    System.out.println("Valor en formato int:    " + (int) c);
    System.out.println("Valor en formato long:   " + (long) c);
   }
}