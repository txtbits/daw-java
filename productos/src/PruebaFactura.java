
public class PruebaFactura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura fac;
		Cliente cli = new Cliente("17000000A", "Luis");
		fac = new Factura("Paco", cli , 555, 120.23);
		System.out.println(fac);
		System.out.println("---------------");
		fac.ImprimeFactura();
	}

}
