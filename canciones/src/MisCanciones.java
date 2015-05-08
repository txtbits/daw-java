import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MisCanciones {
	/**
	 * Para usar la clase Cancion
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cancion c1, c2;
		c1 = new Cancion("Por el culo", "Mojinos Escozios", 270);
		c2 = new Cancion("Sweet Child O' Mine", "Guns n' Roses", "3:10");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("-----------------------------------------------------------------------");
		
		File archivo = new File("Wrecking_Ball.csv");
		FileReader fr = null;
		Cancion canciones[] = new Cancion[13]; // inicializamos el vector de equipos

		try{
			fr  = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			String linea; // para almacenar las líneas que leemos
			String datos[]; // linea troceada
			int nlinea = 0;
			
			while((linea = br.readLine()) != null){
				datos = linea.split(";");
				Cancion can = new Cancion(datos[0],datos[1],datos[2]);
				canciones[nlinea] = can;
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
		// Mostrar el contenido del vector de las canciones
		for (int i=0; i < canciones.length; i++){
			System.out.println(canciones[i]);
		}
	}
}

