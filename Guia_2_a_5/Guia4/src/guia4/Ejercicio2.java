/*
Diseñe una función que pida el nombre y la edad de N personas e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package guia4;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.print("Ingresar cantidad de personas: ");
        int n = leer.nextInt();
        edadPersonas(n);
    }

    public static void edadPersonas(int n) {

        for (int i = 1; i <= n; i++) {

            System.out.print("Ingresar nombre: ");
            String nombre = leer.next();
            System.out.print("Ingresar edad: ");
            int edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            } else if (edad >= 0 && edad < 18) {
                System.out.println(nombre + " es menor de edad");
            } else {
                System.out.println("La edad ingresada es incorrecta");
            }

            if (i != n) {

                System.out.println("Desea continuar?(Si/No)");
                String confirma = leer.next();

                if (confirma.equalsIgnoreCase("No")) {
                    System.out.println("Saliendo del programa...");
                    break;
                }
            }else{
                System.out.println("Ha completa la cantidad de ingresos ("+i+")");
            }
        }
    }
}
