/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
*/
package guia3;
import java.util.Scanner;

public class Ej4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        do{
            System.out.print("Ingresar frase que comience con la letra A: ");
            frase = leer.nextLine();

            if(frase.substring(0, 1).equals("A")){   //Otra forma: if(frase.startsWith("A"))
                System.out.println("Correcto");
                break;
            }else{
                System.out.println("Incorrecto");
            }
        
        } while(true);
        
        System.out.println("Ha salido del programa!");
    }
}
