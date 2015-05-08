
public class PruebaCuentaBancaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria c1, c2, c3;
		c1 = new CuentaBancaria();
		c2 = new CuentaBancaria(3000);
		c3 = new CuentaBancaria();
		
		c1.transferencia(c2);
		System.out.println("Datos de c1: saldo " + c1.saldo());
		System.out.println("Total Cuentas " + c1.totalCuentas);
		
		System.out.println("Datos de c2: saldo " + c2.saldo());
		System.out.println("Total Cuentas " + c2.totalCuentas);
	}

}
