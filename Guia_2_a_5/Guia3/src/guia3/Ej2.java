/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. 
Nota: investigar la función equals() en Java.
*/

package guia3;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        do{
            System.out.print("Ingresar una frase: ");
            frase = leer.nextLine();

            if (frase.equals("eureka")){
                System.out.println("La frase es correcta");
                break;
            } else{
                System.out.println("Incorrecto");
            }
        
        }while (true);
                
        System.out.println("Ha salido del programa!");
    }
}
