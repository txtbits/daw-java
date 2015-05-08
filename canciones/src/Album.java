import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Album {
	String titulo;
	Cancion canciones[] = null;
	
	public Album(String titulo){
		// Crea album inicializando el título
		this.titulo = titulo;
		
	}
	
	private int numero_canciones(String ruta){
		File archivo = new File(ruta);
		FileReader fr = null;
		int nlinea = 0;
		try{
			fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea; // para almacenar las líneas que leemos
			
			while((linea = br.readLine()) != null){
				nlinea++;
			}
		} // fin try
		catch (IOException e){
			System.out.println("No se puede leer el archivo");
		}
		finally{
			if (fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // finally
		return nlinea;
	}
	
	
	public void carga_canciones(String ruta){
		// Inicializa vector de canciones
		int num_canciones = numero_canciones(ruta);
		if (num_canciones > 0){
			canciones = new Cancion[num_canciones];
			File archivo = new File(ruta);
			FileReader fr = null;
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
						e.printStackTrace();
					}
				}
			} // finally	
		} // if hay canciones
	}
	
	public int duracion(){
		int segundos = 0;
		for (int i=0; i < canciones.length; i++){
			segundos += canciones[i].getDuracion();
		}
		return segundos;
	}
	
	private String convierteTiempo(int segundos){
		int minutos, horas;
		// Actualizamos minutos
		minutos = segundos / 60;
		segundos = segundos % 60;
		
		// Actualizamos horas
		horas = minutos / 60;
		minutos = minutos % 60;
		
		return String.format("%02dh:%02dm:%02ds", horas, minutos, segundos);
		
	}
	
	public String toString(){
		if (canciones == null){
			return titulo + " [album vacío]";
		}
		else{
			return titulo + " [" + canciones.length + " canciones :: " + convierteTiempo(duracion()) + "]";
		}
	}
	
	public Cancion [] busca(String texto){
		//devuelve canciones que tienen ese texto en el título
		//null si no encuentra ninguna
		return canciones;
	}
}
