//Crear un programa que dado un número determine si es par o impar.

package guia3;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        int num = leer.nextInt();

        if (num % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
