/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
*/

package guia5;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        int[][] matrizA = new int[4][4];
        
        System.out.println("Matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random()*100 + 1);
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        
        
        System.out.println("Matriz traspuesta");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
