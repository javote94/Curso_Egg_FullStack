/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package guia5;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar tamaño del vector: ");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        int cantDig, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*99999);
            System.out.print("[" + vector[i] + "]");
            
            cantDig = String.valueOf(vector[i]).length();  //a cada elemento del vector lo pasamos a string y calculamos su longitud (cantidad de dígitos)
            
            switch(cantDig){
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                default:
                    d5++;   
            }
        }
        
        System.out.println("\nEn el arreglo hay:"
                + "\nNúmeros de un dígito: " + d1 
                + "\nNúmeros de dos dígitos: " + d2
                + "\nNúmeros de tres dígitos: " + d3
                + "\nNúmeros de cuatro dígitos: " + d4
                + "\nNúmeros de cinco dígitos: " + d5);
    }
}
