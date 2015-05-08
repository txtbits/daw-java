
public class PruebaFecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha f = new Fecha();
		System.out.println("Día "+ f.getD() + " Més " + f.getM() + " Año " + f.getA());
		
		Fecha f2 = new Fecha(14, 3, 2012);
		System.out.println("Día "+ f2.getD() + " Més " + f2.getM() + " Año " + f2.getA());
		f.setD(14);
		f.setM(3);
		System.out.println("Día "+ f2.getD() + " Més " + f2.getM() + " Año " + f2.getA());
	}

}
