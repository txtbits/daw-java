
public class PruebaFecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha f = new Fecha();
		System.out.println("D�a "+ f.getD() + " M�s " + f.getM() + " A�o " + f.getA());
		
		Fecha f2 = new Fecha(14, 3, 2012);
		System.out.println("D�a "+ f2.getD() + " M�s " + f2.getM() + " A�o " + f2.getA());
		f.setD(14);
		f.setM(3);
		System.out.println("D�a "+ f2.getD() + " M�s " + f2.getM() + " A�o " + f2.getA());
	}

}
