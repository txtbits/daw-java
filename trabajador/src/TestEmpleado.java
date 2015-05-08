
public class TestEmpleado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado("Pablo", "AGR0000012", null, 25000);
		System.out.println(empleado1.toString() + " \nSu sueldo es: " + empleado1.calcularSalario() + " €");
	}

}
