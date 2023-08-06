/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.

Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package guia3;

import java.util.Scanner;

public class Ej9extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dividendo, divisor, cociente = 0, residuo = 0;
        
        do {
            System.out.print("Ingresar dividendo (mayor que 1): ");
            dividendo = leer.nextInt();
            System.out.print("Ingresar divisor (mayor que 1): ");
            divisor = leer.nextInt();
        } while (dividendo < 1 || divisor < 1);
        
        while (dividendo >= divisor) {
            cociente++;
            residuo = dividendo - divisor;
            System.out.println(dividendo + " - " + divisor + " = " + residuo + "(" + cociente + ")");
            dividendo = residuo;
        }
        
        System.out.println("Finaliza las restas dado que " + dividendo + " es menor que " + divisor);
        System.out.println(".:RESULTADO:.");
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

    }

}
