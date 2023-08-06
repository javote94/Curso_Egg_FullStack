/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package guia5;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] matriz2 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        
        if(cuadradoMagico(matriz)){
            System.out.println("LA MATRIZ ES MÁGICA!");
        }else{
            System.out.println("La matriz no es mágica");
        }
    }
    
    //////////////////////////FUNCIONES////////////////////////////////////////
    public static boolean cuadradoMagico(int[][] matriz) {
        int filas = sumFilas(matriz);
        int columnas = sumCol(matriz);
        int diagPrincipal = sumDiagPrincipal(matriz);
        int diagSecundaria = sumDiagSecundaria(matriz);
        
        System.out.println("Suma de cada fila: " + filas);
        System.out.println("Suma de cada columna: " + columnas);
        System.out.println("Suma de la diagonal principal: " + diagPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + diagSecundaria);
        
        return (filas == columnas && columnas == diagPrincipal && diagPrincipal == diagSecundaria);
    }
    
    public static int sumFilas(int[][] matriz) {
        int sumaFila1 = 0, sumaFila2 = 0, sumaFila3 = 0;
        for (int j = 0; j < matriz.length; j++) {
            sumaFila1 += matriz[0][j];
            sumaFila2 += matriz[1][j];
            sumaFila3 += matriz[2][j];
        }

        if (sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3) {
            return sumaFila1;
        } else {
            return -30;
        }
    }

    public static int sumCol(int[][] matriz) {
        int sumaColumna1 = 0, sumaColumna2 = 0, sumaColumna3 = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaColumna1 += matriz[i][0];
            sumaColumna2 += matriz[i][1];
            sumaColumna3 += matriz[i][2];
        }

        if (sumaColumna1 == sumaColumna2 && sumaColumna2 == sumaColumna3) {
            return sumaColumna1;
        } else {
            return -39;
        }
    }
    
    public static int sumDiagPrincipal(int[][] matriz){
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        return sumaDiagonal;
    }
    
    public static int sumDiagSecundaria(int[][] matriz){
        int sumaDiagonal = 0;
        int j = 2;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][j];
            j--;
        }
        return sumaDiagonal;
    }
    
}

/*
        int[][] matriz2 = {{1,1,1,1,1},{1,1,1,1}};
        System.out.println(matriz2.length);      //2 filas
        System.out.println(matriz2[0].length);   //5 columnas en la primera fila
        System.out.println(matriz2[1].length);   //4 columnas en la segunda fila
        System.out.println(matriz2[2].length);   //Error. No existe tercera fila.
 */
