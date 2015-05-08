import java.util.Date;


public class Empleado extends Trabajador {
	private final int PAGAS = 12;
	private double sueldoAnual;
	private double impuestos;
	
	public Empleado (String nombre, String NSS, double sueldoAnual){
        super (nombre,NSS);
        this.sueldoAnual = sueldoAnual;
        this.impuestos = 0.3*sueldoAnual;
}
	
	public Empleado(String nombre, String NSS, Date fecha_nacimiento, double sueldoAnual){
		super(nombre, NSS, fecha_nacimiento);
		this.sueldoAnual = sueldoAnual;
		impuestos = 0.3 * sueldoAnual;
	}
	
	public double calcularSalario(){
		return (sueldoAnual-impuestos) /PAGAS;
	}
	
	public String toString(){
		return "Empleado: " + super.toString();
	}
}
