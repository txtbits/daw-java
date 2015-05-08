
public class PruebaProducto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pro, pro2;
		pro = new Producto(666, 120.45);
		System.out.println(pro);
		
		pro2 = new Producto();
		pro2.asignaProducto(777, 165.20);
		System.out.println(pro2);
	}

}
