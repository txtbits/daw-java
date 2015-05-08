import java.util.ArrayList;

	
public class PruebaCaja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Caja> lista = new ArrayList<Caja>();
		
		for (int i=0;i<10;i++){
			lista.add(new Caja(i));
			System.out.println(lista.get(i).getNumero());
		}
		
		
	}

}
