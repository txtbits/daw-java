
public class PruebaFactura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f = new Factura();
		f.asignaValor(1500.00);
		
		System.out.println("Factura SIN I.V.A. " + f.sinIVA());
		System.out.println("Factura CON I.V.A. " + f.conIVA());
		
		System.out.println("Rebaja del 20%");
		f.rebaja(20);
		
		System.out.println("Factura SIN I.V.A. " + f.sinIVA());
		System.out.println("Factura CON I.V.A. " + f.conIVA());
	}
	
}
