
// Declaracion de la clase Factura
public class Factura implements Constantes, Variaciones {
	
	// atributo privado -> asignaValor
	private double totalSinIVA;
	
	public final static double IVA = 0.16;
	public double sinIVA() { return totalSinIVA; }
	public double conIVA() { return totalSinIVA * (1+IVA); }
	public void asignaValor(double x) {
		if (valorMinimo<x) totalSinIVA=x;
		else totalSinIVA=0;  
	}
	public void rebaja(double t) {
		totalSinIVA *= (1-t/100);
	}
}
