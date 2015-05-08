/**
 * @author Alumno
 * Ejemplo de uso de switch
 */
public class Caracter {
  public static void main (String [] args) {
    char c;  // variable carácter para la primera letra
    c=args[0].charAt(0); // .charAt(0) se utiliza para coger indices similar al var[0] en Python.
      switch (c) {
       case 'a': System.out.println("Es la vocal a"); break;
       case 'e': System.out.println("Es la vocal e"); break;
       case 'i': System.out.println("Es la vocal i"); break;
       case 'o': System.out.println("Es la vocal o"); break;
       case 'u': System.out.println("Es la vocal u"); break;
       case 'A': System.out.println("Es la vocal A"); 
       case 'E': System.out.println("Es la vocal E"); 
       case 'I': System.out.println("Es la vocal I");
       case 'O': System.out.println("Es la vocal O");
       case 'U': System.out.println("Vocal mayuscula"); break; 
       default: System.out.println("No es una vocal"); break; 
     }
  }
}
