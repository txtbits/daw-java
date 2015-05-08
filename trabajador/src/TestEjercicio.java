
public class TestEjercicio {

	/**
	 * 1. Crear 10 trabajadores y meterlos en un array (6 empleados y 4 consultores)
	 * 2. Sacar un listado por orden alfabético
	 * 3. Sacar un listado ordenado por sueldo
	 * 4. Sacar un listado ordenado por edad
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador emp[] = new Trabajador[10];
		
		emp[0] = new Empleado("Juan", "AGR0000012", null, 20000);
		emp[1] = new Empleado("Ana", "PRR0000023", null, 18000);
		emp[2] = new Empleado("Marta", "QGR0000061", null, 22000);
		emp[3] = new Empleado("Víctor", "RBR0000092", null, 25000);
		emp[4] = new Empleado("Elisa", "MOR0000018", null, 15000);
		emp[5] = new Empleado("Óscar", "ACU0000057", null, 19000);
	
		
		emp[6] = new Consultor("Antonio", "WEU0000093", null, 90, 35.1);
		emp[7] = new Consultor("Cristina", "TRE0000055", null, 200, 15.5);
		emp[8] = new Consultor("Marco", "VCS0000011", null, 80, 50.5);
		emp[9] = new Consultor("Daniel", "NFP0000033", null, 140, 63.23);
		
		
		System.out.println("-------------------| SIN ORDENAR |-------------------\n");
		imprimir_trabajadores(emp);;
		System.out.println("\n--------------| ORDENADO POR NOMBRE |----------------\n");
		burbujaNombre(emp);
		System.out.println("\n--------------| ORDENADO POR SALARIO |---------------\n");
		burbujaSalario(emp);
		System.out.println("\n---------------| ORDENADO POR EDAD |-----------------\n");
		burbujaEdad(emp);
	}
	
	// si no se define con static da error
	private static void imprimir_trabajadores(Trabajador trabajador[]){
		for (int i=0; i< trabajador.length ; i++) {
			System.out.println(trabajador[i] + " y salario: " + trabajador[i].calcularSalario());
		}
	}
	
	private static void burbujaNombre(Trabajador[] x) {
	    int n = x.length;
	    for (int k=1; k < n; k++) {  // count how many times
	        // This next loop becomes shorter and shorter
	        for (int i=0; i < n-k; i++) {
	            if (x[i].getNombre().compareTo(x[i+1].getNombre()) > 0 ) {
	                // exchange elements
	                Trabajador temp = x[i];  x[i] = x[i+1];  x[i+1] = temp;
	            }
	        }
	    }
	    for (int i=0; i< x.length ; i++) { 
	    	System.out.println(x[i] + " y salario: " + x[i].calcularSalario());
	    }
	}
	
	
	private static void burbujaSalario(Trabajador[] x) {
	    int n = x.length;
	    for (int k=1; k < n; k++) {  // count how many times
	        // This next loop becomes shorter and shorter
	        for (int i=0; i < n-k; i++) {
	            if (x[i].calcularSalario() > x[i+1].calcularSalario()) {
	                // exchange elements
	                Trabajador temp = x[i];  x[i] = x[i+1];  x[i+1] = temp;
	            }
	        }
	    }
	    for (int i=0; i< x.length ; i++) { 
	    	System.out.println(x[i] + " y salario: " + x[i].calcularSalario());
	    }
	}
	
	private static void burbujaEdad(Trabajador[] x) {
	    int n = x.length;
	    for (int k=1; k < n; k++) {  // count how many times
	        // This next loop becomes shorter and shorter
	        for (int i=0; i < n-k; i++) {
	            if (x[i].getFecha_nacimiento().compareTo(x[i+1].getFecha_nacimiento()) > 0 ) {
	                // exchange elements
	                Trabajador temp = x[i];  x[i] = x[i+1];  x[i+1] = temp;
	            }
	        }
	    }
	    for (int i=0; i< x.length ; i++) { 
	    	System.out.println(x[i] + " y salario: " + x[i].calcularSalario());
	    }
	}
	
}
