/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[][] matrizA = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[j][i] + "]");
            }
            System.out.println("");
        }

        //resolucion por suma
        boolean antisimetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] + matrizA[j][i] != 0) {  //if(matrizA[i][j] * (-1) == matrizA[j][i])
                    antisimetrica = false;
                    break;
                }
            }
            if (!antisimetrica) {
                break;
            }
        }
        System.out.println("La matriz es antisimetrica: " + antisimetrica);
        System.out.println("La matriz es antisimetrica: " + antisim(matrizA));

    }

    public static boolean antisim(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] != 0) {  //if(matrizA[i][j] * (-1) == matrizA[j][i])
                    return false;
                }
            }
        }
        return true;
    }
}
