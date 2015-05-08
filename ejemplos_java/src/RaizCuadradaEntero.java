/**
 *  RaizCuadradaEntero: Ejemplo de try-catch
 *  Calcula la raiz cuadrada del valor entero introducido
 */
import java.io.*;
public class RaizCuadradaEntero {
   public static void main (String [] args){
   BufferedReader in = new BufferedReader ( new
                           InputStreamReader( System.in ) );
   int v;
   String cadena;
   System.out.print("Introduce un entero positivo: ");
   try {
       cadena = in.readLine();
       v = Integer.parseInt(cadena); 
       System.out.println("Raiz cuadrada=" + Math.pow(v,0.5));
       }
   catch (Exception exc )
       { System.out.println( exc ); }
   System.out.println("Esta es la sentencia final del programa. "); 
   }
}
