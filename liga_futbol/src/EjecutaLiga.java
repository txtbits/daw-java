import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EjecutaLiga {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = new File("ligahoy.csv");
		FileReader fr = null;
		Equipo equipos[] = new Equipo[20]; // inicializamos el vector de equipos
		
		try{
			fr  = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			String linea; // para almacenar las líneas que leemos
			String datos[]; // linea troceada
			int nlinea = 0;
			
			while((linea = br.readLine()) != null){
				if (nlinea > 0){
					datos = linea.split(";");
					Equipo eq = new Equipo(datos[1], datos[3], datos[4]);
					equipos[nlinea-1] = eq;
				}
			nlinea++;
			}
		}
		catch (IOException e){
			System.out.println("No se puede leer el archivo");
		}
		finally{
			if (fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // finally

		// Mostrar el contenido del vector de los equipos
		for (int i=0; i<20; i++){
			System.out.println(equipos[i]);
		}
		
		/*
		// Mostrar ordenado
		Arrays.sort(equipos, new Comparator(){
			public int compare(Object o1, Object o2){
				String nombre1 = ((Equipo) o1).getNombre();
				String nombre2 = ((Equipo) o2).getNombre();
				return nombre1.compareTo(nombre2);
			}
		});
		*/
		
		/*
		// Mostrar ordenado
		Arrays.sort(equipos, new Comparator(){
			public int compare(Object o1, Object o2){
				String nombre1 = ((Equipo) o1).getNombre();
				String nombre2 = ((Equipo) o2).getNombre();
				return nombre2.compareTo(nombre1);
			}
		});
		*/
		
		// Mostrar ordenado por puntos
		Arrays.sort(equipos, new Comparator(){
			public int compare(Object o1, Object o2){
				int puntos1 = ((Equipo) o1).puntos();
				int puntos2 = ((Equipo) o2).puntos();
				if (puntos1 < puntos2) // el primero es menor
					return 1;
				else if (puntos2 < puntos1)
					return -1; // el segundo es menor
				else
					return 0; // iguales
			}
		});
		for (int i=0; i<20; i++){
			System.out.println(equipos[i]);
		}
	} // main
}