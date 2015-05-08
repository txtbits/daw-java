
public class TestTrabajador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador trabajador1 = new Trabajador("Pedro", "ALF000001A", null);
		Trabajador trabajador2 = new Trabajador("Luis");
		
		
		//Salida estandar con toString()
       System.out.println(trabajador1);
		System.out.println(trabajador2);
        
        //comparacion de objetos con equals()
        System.out.println(trabajador1.equals(trabajador2));

        System.out.println("Salario trabajador1: " + trabajador1.calcularSalario());
	}

}
