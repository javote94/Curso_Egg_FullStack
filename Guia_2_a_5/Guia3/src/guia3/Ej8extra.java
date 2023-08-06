/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia3;

import java.util.Scanner;

public class Ej8extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, n = 0, nP = 0, nI = 0;

        do {
            System.out.print("Ingresar número entero positivo: ");
            num = leer.nextInt();
            if (num <= 0) {
                System.out.println("El número ingresado es inválido!");
                continue;
            }

            if (num % 5 == 0) {
                System.out.println("Ha ingresado un número múltiplo de 5. Se detiene la lectura");
                System.out.println("Cantidad de número leídos: " + n);
                System.out.println("Cantidad de número pares: " + nP);
                System.out.println("Cantidad de número impares: " + nI);
                break;
            } else {
                n++;
                if (num % 2 == 0) {
                    nP++;
                } else {
                    nI++;
                }
            }
        } while (true);

        System.out.println("Finaliza el programa");
    }
}
