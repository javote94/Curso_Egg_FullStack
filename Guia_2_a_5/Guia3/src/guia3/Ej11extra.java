/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package guia3;

import java.util.Scanner;

public class Ej11extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresar un número entero: ");
        int num = leer.nextInt();

        int digitos = 0;
        while (num > 0) {
            num /= 10;
            digitos++;
        }
        System.out.println("Cantidad de dígitos: " + digitos);
    }
}
