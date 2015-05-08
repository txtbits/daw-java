
public class TestAutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autores[] = new Autor[3];
		autores[0] = new Autor("Paco", "franco@españa.es", 'M');
		autores[1] = new Autor("Manolo", "cabeza@bolo.es", 'M');
		autores[2] = new Autor("Luis Miguel Morillas", "lmorillas@gmail.com", 'M');	
		Libro libreria[] = new Libro[5];
		libreria[0] = new Libro("Manual de gestión nacional", autores[0], 666.66, 10);
		libreria[1] = new Libro("El Musical", autores[1], 99.99, 5);
		libreria[2] = new Libro("Manual de Python", autores[2], 0, 43);
		libreria[3] = new Libro("Manual de Amara", autores[2], 0, 34);
		libreria[4] = new Libro("Cómo ser jefe de estado", autores[0], 50.99, 9999);
		for(int i=0;i<=4;i++){
			System.out.println(libreria[i] + "\n" + "Su precio es: " + libreria[i].getPrecio() + " €" + "\n" +  "La cantidad en stock: " + libreria[i].getCantidad() + " unidades");
			if (i<4)
			System.out.println("-----------------------------------------------------------------------");
		}
	}
}
