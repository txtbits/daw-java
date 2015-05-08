
public class TestArrayTrabajador {

        public static void pagar (Trabajador trabajadores[]){
                int i;
                
                for (i=0; i<trabajadores.length;i++)
                        realizarTransferencia (trabajadores[i],trabajadores[i].calcularSalario());
        }
        
        public static void realizarTransferencia (Trabajador trabajaor, double paga){
                System.out.println(trabajaor.getNombre()+" recibe "+paga);
        }

        
        public static void main(String[] args) {
                Trabajador trabajadores[] = new Trabajador[10];
                
                trabajadores[0] = new Empleado("Jose", "123", 24000.0);
                trabajadores[1] = new Consultor("Juan", "456", 10, 50.0);
                trabajadores[2] = new Empleado("Luis","789",14000);
                trabajadores[3] = new Empleado("Eduardo","147",16000);
                trabajadores[4] = new Empleado("Laura","789",18000);
                trabajadores[5] = new Empleado("Adrian","789",30000);
                trabajadores[6] = new Empleado("Rosa","789",22000);
                trabajadores[7] = new Consultor("Pepito", "456", 15, 45.0);
                trabajadores[8] = new Consultor("Antonio", "456", 8, 60.0);
                trabajadores[9] = new Consultor("Luisa", "456", 30, 30.0);
                                                
                
                pagar(trabajadores);
                
        }

}
