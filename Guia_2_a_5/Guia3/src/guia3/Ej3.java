/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
*/
package guia3;
import java.util.Scanner;

public class Ej3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        boolean log = false;
        
        do{
            System.out.print("Ingresar frase de 8 caracteres: ");
            frase = leer.nextLine();

            if (frase.length() == 8){
                System.out.println("Correcto");
                break;
            }else{
                System.out.println("Incorrecto");
            }
        }while(true);
        
        System.out.println("Ha salido del programa!");
    }
}
