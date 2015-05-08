import java.util.Scanner;
import java.io.*;

public class LeerFicheroScanner {

	/**
	 * @param args
	 */
	
	public static double sueldoNeto(int horas, double precioHora){
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
		// TODO Auto-generated method stub
		Scanner datos = null;
		try {
			
		
			File f = new File("datos.txt");
			datos = new Scanner(f);
			int l=1;
			double sNeto;
			// datos.useDelimiter("\n");   fija el delimitador que nosotros elijamos
			while (datos.hasNext()){
				String empleado = datos.next();
				Integer horas = datos.nextInt();
				Double precioHora = datos.nextDouble();
				sNeto = sueldoNeto(horas, precioHora);
				System.out.println(l + " Trabajador: " + empleado);
				System.out.println(l + " Horas: " + horas);
				System.out.println(l + " Precio/hora: " + precioHora);
				System.out.println(l + " Precio/hora: " + sNeto );
				System.out.println();
				l++;
			}
		}
		catch (IOException e){
			System.out.println("Error de acceso al fichero");
		}
		
		
	}

}
