/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/
package guia3;
import java.util.Scanner;


public class Ej1extra {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int minutos, horas, dias;
        
        System.out.print("Ingresar cantidad de minutos: ");
        minutos = leer.nextInt();
        
        dias = minutos / 1440;               //de minutos totales a días completos
        horas = (minutos % 1440) / 60;       //del residuo de los minutos totales a horas completo
        minutos = minutos % 60;              //resto que queda en minutos
        
        System.out.println("Equivale a \n"
        + "Días: " + dias + "\n"
        + "Horas: " + horas + "\n"
        + "Minutos: " + minutos);
    }
}
