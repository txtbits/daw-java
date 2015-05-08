
public class Libro {
	private String nombre;
	private Autor autor;
	private double precio;
	private int cantidad;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public Autor getAutor() {
		return autor;
	}
	
	public Libro(String nombre, Autor autor, double precio, int cantidad) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String toString() {
		return nombre + " escrito por: " + autor;
	}
	
}
