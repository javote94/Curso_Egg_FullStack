/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/

package guia2;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar una frase: ");
        String frase = leer.nextLine();
        
        String mayuscula = frase.toUpperCase();
        String minuscula = frase.toLowerCase();
        
        System.out.println(mayuscula);
        System.out.println(minuscula);
        
    }
}
