
public class Equipo {
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	private int pganados = 0;
	private int pempatados = 0;
	
	public String toString(){
		return nombre + " (" + puntos() + ")";
	}
	public Equipo(String eq, int gana, int empata){
		nombre = eq;
		pganados = gana;
		pempatados = empata;
	}
	
	// Convierte las cadenas a enteros
	public Equipo(String eq, String gana, String empata){
		nombre = eq;
		pganados = Integer.parseInt(gana);
		pempatados = Integer.parseInt(empata);
	}
	
	public int puntos(){
		return pganados * 3 + pempatados;
	}
}
