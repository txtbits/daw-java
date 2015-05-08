import java.io.*;

public class LeerFicherosTexto {

	/**
	 * @param args
	 */
	public static double sueldoNeto(int horas, int precioHora){
		/*
		 * las horas por encima de 140 se consideran horas extras
		 * las horas extras se pagan al 65 % más que las horas ordinarias
		 * si el salario bruto es mayor que 2000 euros, se aplica una deducción por impuestos del 12 %; si no, no se aplica deducción alguna
		 */
		double salario;
		if (horas < 140)
			salario = horas * precioHora;
		else
			salario = (140 * precioHora) + ((horas -140) * (precioHora*1.65));
		if (salario > 2000)
			salario -= salario *0.12; 
		return salario;
		
	}
	public static void main(String[] args) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			archivo = new File("datos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			int n = 1;
			double sNeto;
			while((linea = br.readLine()) != null){
				String empleado = linea.substring(0,10).trim();
				Integer horas = Integer.parseInt(linea.substring(10,13).trim());
				Integer precioHora = Integer.parseInt(linea.substring(14).trim());
				/*System.out.println("linea " + n + ": " + linea);
				System.out.println("Código empleado: " + empleado);
				System.out.println("El salario es: " + horas);
				System.out.println("El precio hora es: " + precioHora);
				*/
				n++;
				sNeto = sueldoNeto(horas, precioHora);
				System.out.println("El salario neto del empleado " + empleado + " es ---> \t" + sNeto + "\n");
				
			}
			
		}
		catch(Exception e){
			System.out.println("No se puede leer el fichero");
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
		}
	}
}
