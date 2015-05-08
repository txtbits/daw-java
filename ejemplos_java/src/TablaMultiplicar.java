/**
 *  TablaProducto: Ejemplo de bucle for
 *  Visualiza la tabla de multiplicar del valor dado como parametro
 */
public class TablaMultiplicar {
   public static void main (String [] args) {
      int valor;
      valor = 5; // tabla del ...
      System.out.println("Tabla de multiplicar del numero " + valor);
      for (int i=1; i<=10; i++){
         System.out.println(valor + " * " + i + " = " + valor*i );
      } 
   }
}
