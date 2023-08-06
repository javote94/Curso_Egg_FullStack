/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/

package guia2;
import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar grados centígrados: ");
        Double centigrado = leer.nextDouble();
        
        Double fahrenheit = 32+(9*centigrado/5);
        
        System.out.println("Su equivalencia en grados Fahrenheit es: "+fahrenheit);
    }
}
