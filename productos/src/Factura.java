
public class Factura extends Producto {
	private String emisor;
	private Cliente cliente;
	
	public Factura(String emisor, Cliente cliente, int codigo, double precio){
		super(codigo, precio);
		this.emisor = emisor;
		this.cliente = cliente;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	// Primera opción: con toString()
	public String toString() {
		return "Factura: " + super.toString() + "\nEmisor: " + getEmisor() + "\nCliente: " + getCliente();
	}
	
	// Segunda opción:
	public void ImprimeFactura(){
		System.out.println("****************** FACTURA ******************");
		System.out.println("Emisor: " + emisor);
		System.out.println("Cliente: " + cliente);
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Precio: " + getEuros());
	}
	
}
