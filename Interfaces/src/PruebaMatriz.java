import maths.*;

public class PruebaMatriz {
   public static void main (String [] args) {
      int filas = 3;
      int columnas = 4;
      double [][] a = new double[filas][columnas]; 
      for (int i=0; i<a.length; i++) {
          for (int j=0; j<a[i].length; j++) {
              a[i][j] = 10*Math.random();
              System.out.println("a["+i+"] ["+j+"] = "+a[i][j]); }
      }
      System.out.println("Minimo    : " + Matriz.min(a));
      System.out.println("Maximo    : " + Matriz.max(a));
      System.out.println("Sumatorio : " + Matriz.sum(a));
      }
}
