
public abstract class FiguraGeometrica {
    // Declaracion de atributos
    private String nombre;
    // Declaracion de metodos
    abstract public double area();
    abstract public double perimetro();
    public FiguraGeometrica (String nombreFigura ) {
        nombre = nombreFigura;
    }
    final public boolean mayorQue (FiguraGeometrica otra) {
        return area()>otra.area();
    }
    final public String toString() {
        return nombre + " con area: " + area() + " y perimetro: " + perimetro(); 
    }
}