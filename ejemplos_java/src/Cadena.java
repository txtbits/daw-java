/**
 *  Cadena: Ejemplo de uso de String
 *  A. Garcia-Beltran, octubre 2010
 */
public class Cadena {
  public static void main (String [] args) {
     String saludo = "Hola";
     String despedida;
     despedida = "Adios";
     String cortesia = saludo + " y " + despedida;
     System.out.print(cortesia + " tiene ");
     System.out.println(cortesia.length() + " caracteres");
     for (int i=cortesia.length()-1 ; i>=0; i--) {
         System.out.print(cortesia.charAt(i));
         }
     System.out.print("\n");
     // Imprimir cada letra en una línea: índice y la letra
     // desde el inicial al final
     // todas en minúscula
     
     for (int i=0; i<cortesia.length(); i++) {
         System.out.format("Índice -> %2d  Letra -> %s \n", i +1, Character.toLowerCase(cortesia.charAt(i)));
         }
     }
}
