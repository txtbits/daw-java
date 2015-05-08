
public class Fecha {
	private int d; // Dia
	private int m; // Mes
	private int a; // Año
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	// Constructor
	public Fecha(){
		d = 1;
		m = 1;
		a = 2012; 
	}
	public Fecha(int d, int m, int a){
		this.d = d;
		this.m = m;
		this.a = a;
	}
}
