import java.util.ArrayList;
import java.util.HashMap;

public class IntroColecciones {

	/**
	 * @param args
	 */
	
	static void rellenar (ArrayList<String> a){
		a.add("luis");
		a.add("pilar");
		a.add("maría");
	}
	
	static void rellenar (HashMap<String, String> mapa){
		mapa.put("perro", "guau");
		mapa.put("gato", "miau");
		mapa.put("pajaro", "pio");
	}
	
	public static void main(String[] args) {
		
		ArrayList <String> lista = new ArrayList<String>();
		rellenar(lista);
		
		System.out.println(lista);
		System.out.println(lista.get(2));
		
		// Eliminar elementos de la lista por su indice
		lista.remove(0);
		
		lista.add("Miguel");
		lista.add("Juan");
		
		// No podemos añadir numeros puesto que hemos puesto array tipo cadena -> ArrayList <String> = new ArrayList<String>();
		//lista.add(10);
		
		System.out.println(lista);
		
		// Tamaño de la lista
		System.out.println("Tamaño de la lista: " + lista.size());
		
		// Mostrar un resultado buscado por el indice
		System.out.println(lista.get(3));
		
		// for clasico
		for (int i = 0; i < lista.size(); i++){
			System.out.println(i + ": " + lista.get(i));
		}
		
		System.out.println("-------------");
		
		// for nuevo (python style)
		int i=1;
		for (String p: lista){
			System.out.println( i + ": " + p);
			i++;
		}
		
		// Diccionarios - mapas
		HashMap<String, String> mapa = new HashMap<String, String>();
		rellenar(mapa);
		System.out.println("Tamaño: " + mapa.size() + "\nClaves: " + mapa.keySet() + "\nValores: " + mapa.values());                                                                           
	}
	
}
