
public class PruebaFecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha fech = new Fecha(20,4,2012);
		System.out.println(fech);
		fech.siguienteDia();
		System.out.println(fech);
		
		Fecha fech2 = new Fecha(31,12,2012);
		System.out.println(fech2);
		fech2.siguienteDia();
		System.out.println(fech2);
		
		Fecha fech3 = new Fecha(28,2,2012);
		System.out.println(fech3);
		fech3.siguienteDia();
		System.out.println(fech3);
	}

}