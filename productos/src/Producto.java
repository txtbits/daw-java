
public class Producto extends Precio {
	
	// Atributos
	private int codigo;
	
	// Constructores
	public Producto(int codigo, double precio) {
		setCodigo(codigo);
		setEuros(precio);
	}
	public Producto() {
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void asignaProducto(int cod, double p) {
	    setCodigo(cod); 
	    setEuros(p);
	}
	public double getEuros() {
		return super.getEuros() + 1;
	}
	public String toString() {
	    return getCodigo() + "\nPrecio: " + getEuros() + " euros";
	}  
}
