import java.util.Date;


public class Consultor extends Trabajador {
	private int horas;
	private double honorarios;
	
	public Consultor(String nombre, String NSS, int horas, double honorarios){
		super(nombre, NSS);
		this.horas = horas;
		this.honorarios = honorarios;
	}
	
	public Consultor(String nombre, String NSS, Date fecha_nacimiento, int horas, double honorarios){
		super(nombre, NSS, fecha_nacimiento);
		this.horas = horas;
		this.honorarios = honorarios;
	}
	
	public double calcularSalario(){
		return horas*honorarios;
	}
	
	public String toString(){
		return "Consultor: " + super.toString();
	}
}
