// Ejemplo de utilizacion de la clase Precio
public class PruebaPrecio {
    public static void main (String [] args ) {
        Precio p;           // Creacion de la referencia
        p = new Precio();   // Instanciacion
        p.pone(56.8); 
        System.out.println("Valor = " + p.da());
        Precio q = new Precio(); 
        q.pone(75.6); // usa directamente el atributo 
        System.out.println("Valor = " + q.da());
    }
}
