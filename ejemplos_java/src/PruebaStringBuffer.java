public class PruebaStringBuffer {
  public static void main(String [] args) {  
    StringBuffer s1 =  new StringBuffer("Una cadena");
    
    System.out.println("Cadena original:" + s1);
    s1.append(" que puede modificarse.");
    System.out.println(s1);    
    System.out.println("Su longitud es de "+s1.length()+" caracteres.");
    System.out.println("Pero su capacidad es de " + s1.capacity()+'.');
    s1.insert(10," de caracteres");
    System.out.println(s1);
    System.out.print("Subcadena de la posicion 4 a la 24: ");
    System.out.println(s1.substring(4,24));   
    s1.reverse();
    System.out.println(s1); 
  }
}
