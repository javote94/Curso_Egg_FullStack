/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guia3;

import java.util.Scanner;

public class Ej6extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        float altura, sumGeneral = 0, sumBajo = 0, promGeneral = 0, promBajo = 0;

        System.out.print("Ingresar cantidad de personas: ");
        int n = leer.nextInt();

        int j = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresar altura de la persona " + i + ": ");
            altura = leer.nextFloat();

            sumGeneral += altura;
            if (altura < 1.60) {
                sumBajo += altura;
                j++;
            }
        }

        promGeneral = sumGeneral / n;
        promBajo = sumBajo / j;

        System.out.println("El promedio de estaturas en general es: " + promGeneral);
        System.out.println("El promedio de estaturas por debajo de 1.60 es: " + promBajo);
    }
}
