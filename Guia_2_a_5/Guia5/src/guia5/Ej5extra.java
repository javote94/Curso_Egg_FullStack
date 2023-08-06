/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
*/
package guia5;
import java.util.Scanner;

public class Ej5extra {
    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        int filas,columnas;
        
        System.out.print("Ingrese la cantidad de filas: ");
        filas = leer.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columnas = leer.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        int sumatoria = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print("[" + matriz[i][j] + "]");
                sumatoria += matriz[i][j];
            }
            System.out.println("");
        }
        
        System.out.println("La suma de los elementos de la matriz es: " + sumatoria);
    }
}
