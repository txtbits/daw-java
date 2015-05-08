public class PruebaSobrecarga {
   public static void main (String [] args) {
     int a=34;
     int b=12;
     int c=56;
     int d=83;
     System.out.println("a = " + a + "; b = " + b + "; c = " + c);
     System.out.println("El mayor de a y b es: " + mayor(a,b));
     System.out.println("El mayor de a, b y c es: " + mayor(a,b,c));
     System.out.println("El mayor de a, b, c y d es: " + mayor(a,b,c,d));
     ordenados(a, b, c);
   }
   // Definicion de mayor de dos numeros enteros
   public static int mayor (int x, int y) {
     return x>y ? x : y;
   }
   // Definicion de mayor de tres numeros enteros
   public static int mayor (int x, int y, int z) {
     return mayor(mayor(x,y),z);
   }
   /*
   public static int mayor (int x, int y, int z, int w) {
	     return mayor(mayor(mayor(x,y),z), w);
   }
   */
   // Más óptimo :-)
   public static int mayor (int x, int y, int z, int w) {
	     return mayor(mayor(x,y,z),w);
   }
   
   public static void ordenados(int x, int y, int z){
	   int menor, mayor, medio;
	   if (x > y) {
		   mayor = x;
		   menor = y;
	   }
	   else {
		   mayor = y;
		   menor = x;
	   }
	   
	   if (z > mayor) {
		   medio = mayor;
		   mayor = z;
	   }
	   
	   else if (z > menor)
		   medio = z;
	   else {
		   medio = menor;
		   menor = z;		   
	   }
	   System.out.format("Los numeros %d, %d y %d ordenados son %d, %d y %d" ,x, y, z, menor, medio, mayor);
	   
   }
} 
