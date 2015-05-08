public class CuentaBancaria {
  private double saldo;
  
  // atributo estático
  public static int totalCuentas=0;
  
  // Constructores
  public CuentaBancaria( ) {
     this(0.0);      // Llamada al constructor de un parametro
  } 
  public CuentaBancaria(double ingreso) {
     saldo = ingreso;	// Llamada al constructor de un parametro
     incrementoTotalCuentas();
  }
  
  
  public static void incrementoTotalCuentas () {
     totalCuentas++;
  }
  public void transferencia(CuentaBancaria origen) {
     saldo += origen.saldo;
     origen.saldo=0; 
  }
  public double saldo() {
     return saldo;
  }
}
