/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
*/
package guia3;
import java.util.Scanner;

public class Ej3extra {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar una letra: ");
        char letra = leer.nextLine().charAt(0);         
        String letraString = String.valueOf(letra);     //la letra la pasamos a tipo String para acceder a sus métodos
        
        String vocales = "aeiou";
        boolean vocal = vocales.contains(letraString);
        
        if(vocal){
            System.out.println("La letra es una vocal");
        }else{
            System.out.println("La letra no es una vocal");
        }
        
        
    }
}
