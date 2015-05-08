/**
 * @author Alumno
 *
 */
public class Calcula {
	public static void main (String [] args) {
		if  (args.length != 3)
			System.out.println("Uso: Calcula <operación> op1 op2");
		else{
			// tiene 3 parámetros...
			String operacion = args[0];
			int op1, op2;
			
			// inicializar operadores
			op1 = Integer.parseInt(args[1]);
			op2 = Integer.parseInt(args[2]);
			
			// realizo operacion
			switch (operacion) {
				case "suma": System.out.println("La suma es: " + (op1 + op2)); break;
				case "resta": System.out.println("La resta es: " + (op1 - op2)); break;
				case "multiplicacion": System.out.println("La multiplicación es: " + (op1 * op2)); break;
				case "division": System.out.println("La división es: " + (op1 / op2)); break;
				default: System.out.println("La operación introducida no es válida"); break;
			}
		}
		
		
		
	}
}
