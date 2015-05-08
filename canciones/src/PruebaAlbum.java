
public class PruebaAlbum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Album mialbum;
		mialbum = new Album("Nuevo Album");
		System.out.println(mialbum);
		// inicializar las canciones del album
		mialbum.carga_canciones("canciones.csv");
		System.out.println(mialbum);
	}

}
