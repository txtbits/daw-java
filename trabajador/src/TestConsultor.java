import java.util.Date;

public class TestConsultor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consultor consultor1 = new Consultor("Pablo", "AGR0000012", new Date("01/01/1999") , 65, 10.5);  // Convertirmos la cadena directamente en formato fecha
		System.out.println(consultor1.toString() + " \nSu sueldo es: " + consultor1.calcularSalario() + " €");
	}
	
	

}
