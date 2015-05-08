
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    public Rectangulo (double largo, double ancho) {
        super("Rectangulo");
        base=largo;
        altura=ancho;
    }
    public double area () {
        return (base * altura);
    }
    public double perimetro(){
    	return (base + altura);
    }
}

