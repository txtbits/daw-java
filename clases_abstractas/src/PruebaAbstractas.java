
public class PruebaAbstractas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rect1, rect2;
		rect1 = new Rectangulo(50, 10);
		rect2 = new Rectangulo(50, 20);
		
		if (rect1.mayorQue(rect2))
			System.out.println(rect1);
		else
			System.out.println(rect2);
	}
}
