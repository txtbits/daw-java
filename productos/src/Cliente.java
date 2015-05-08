
public class Cliente {
	private String CIF;
	private String nombre;
	
	public Cliente(String cIF, String nombre) {
		CIF = cIF;
		this.nombre = nombre;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString(){
		return nombre + " [" + CIF + "]";
	}

}
