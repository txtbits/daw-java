import java.util.Date;


public class Trabajador {
	private String nombre;
	private String puesto;
	private String direccion;
	private String telefono;
	private Date fecha_nacimiento;
	private Date fecha_contrato;
	private String NSS;
	
	//Constructores
	
    public Trabajador (String nombre, String NSS){
            this.nombre = nombre;
            this.NSS = NSS;
    }

    public Trabajador (String nombre, String NSS, Date fecha_nacimiento){
            this.nombre = nombre;
            this.NSS = NSS;
            this.fecha_nacimiento = fecha_nacimiento;
    }
	
    // Getters - Setters
    
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(int d, int m, int a ) {
        this.fecha_nacimiento = new Date(d, m, a);
	}

	public Date getFecha_contrato() {
		return fecha_contrato;
	}

	public void setFecha_contrato(Date fecha_contrato) {
		this.fecha_contrato = fecha_contrato;
	}

	public Trabajador (String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNSS() {
		return NSS;
	}

	public void setNSS(String nSS) {
		NSS = nSS;
	}
	
	
	// Comparación de objetos
	
	public boolean equals (Trabajador t) {
		return this.NSS.equals(t.NSS);
	}
	
	
	public String toString(){
		return nombre + " con número: " + NSS + " con fecha de nacimiento: " + fecha_nacimiento;
	}
	
	public double calcularSalario(){
		return 0.0;
	}
}
