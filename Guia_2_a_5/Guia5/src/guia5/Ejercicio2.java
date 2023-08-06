/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package guia5;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99 + 1);
            System.out.print("[" + vector[i] + "]");
        }

        System.out.print("\nIngresar número a buscar en el vector: ");
        int numUsuario = leer.nextInt();

        String indices = "";
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numUsuario) {
                indices += String.valueOf("(" + i + ")");
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("El número " + numUsuario + " está en los índices: " + indices);
        } else {
            System.out.println("No se encontraron coincidencias");
        }
    }
}
