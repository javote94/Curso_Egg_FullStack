/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
*/

package guia3;
import java.util.Scanner;

public class Ej5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int limite, num, suma;
        
        System.out.print("Ingresar valor límite positivo: ");
        limite = leer.nextInt();
        
        suma = 0;
        while(suma <= limite){
            System.out.print("Ingresar número: ");
            num = leer.nextInt();
            suma += num;
            System.out.println("Suma acumulada: " + suma);
        }
        
        System.out.println("Ha salido del programa!");
    }
}
