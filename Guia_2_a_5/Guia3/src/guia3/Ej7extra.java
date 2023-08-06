/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package guia3;

import java.util.Scanner;

public class Ej7extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, maximo = 0, minimo = 0, sumatoria = 0;

        System.out.print("Cantidad de números que va a ingrear al programa: ");
        int n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar " + (i + 1) + "° número: ");
            num = leer.nextInt();
            sumatoria += num;

            if (i == 0) {
                maximo = num;
                minimo = num;
            } else {
                if (num > maximo) {
                    maximo = num;
                } else if (num < minimo) {
                    minimo = num;
                }
            }
        }
        
        double promedio = (double) sumatoria / n;
        System.out.println("El promedio de los " + n + " números ingresados es: " + promedio);
        System.out.println("El valor mínimo ingresado fue: " + minimo);
        System.out.println("El valor máximo ingresado fue: " + maximo);
    }

}
