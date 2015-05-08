import java.util.Scanner;
/*
 * 8) Expresión que transforma una temperatura dada en grados Fahrenheit a Celsius.
 */
public class ConversorTemperatura {
    public static void main(String[] args) {
        Double fahr;
        Double cel;
        Scanner in;
 
        in = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahr = in.nextDouble();
 
        cel = (fahr - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + cel);
 
        System.exit(0);
    }
}