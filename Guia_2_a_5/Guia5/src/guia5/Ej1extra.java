/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */

package guia5;
import java.util.Scanner;

public class Ej1extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresar tamaño del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];

        int sumatoria = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar valor en el índice " + (i) + ":");
            vector[i] = leer.nextInt();
            sumatoria += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + sumatoria);
    }
}
