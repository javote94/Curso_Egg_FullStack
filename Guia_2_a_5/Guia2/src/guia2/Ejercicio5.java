/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
*/

package guia2;
import java.util.Scanner;


public class Ejercicio5 {
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar un número entero: ");
        int num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble es: "+doble);
        System.out.println("El triple es: "+triple);
        System.out.println("La raíz cuadrada es: "+raiz);
    }
}
