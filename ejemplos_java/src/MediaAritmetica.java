import java.io.*;
public class MediaAritmetica {
  public static void main (String [] args) {
    BufferedReader in = new BufferedReader ( new
                           InputStreamReader( System.in ) );
    double [] numeros = new double [10];
    double suma=0.0;
    int i=0;
    try {
        do {
        System.out.print("Introduce el valor " + (i+1) + ": ");
        String c = in.readLine();
        numeros[i] = Double.parseDouble(c);
        i++;
        } while (i<10);
    }
    catch (Exception exc )
    { //System.out.println( exc );
    } 
    for (int x=0; x < i; x++){
    	suma += numeros[x];
    }
    if (i > 0) // He introducido algún valor?
    	System.out.println("La media aritmetica es: " + (suma/i));
    else
    	System.out.println("No se han introducido valores");
  }
}
