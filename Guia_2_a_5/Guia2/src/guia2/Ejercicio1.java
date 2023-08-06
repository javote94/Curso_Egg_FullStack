/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/

package guia2;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        
        System.out.println("Ingresar dos números enteros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        System.out.println("La suma es: "+suma);
    }
}
