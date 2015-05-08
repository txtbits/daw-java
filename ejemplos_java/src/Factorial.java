/** 
 *  factorial: ejemplo de uso del bucle for
 *  A. Garcia-Beltran - octubre, 2009
 */
public class Factorial {
    public static void main (String [] args){
        int n, f;
        n = 16;
        f = 1;
        for (int i = 2; i<=n; i++) {
            f *= i;      //  equivalente a f = f * i
        }
        System.out.print("El factorial de " + n);
        System.out.println(" es: " + f);
    }
}