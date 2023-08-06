/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package guia5;

public class Ej3extra {

    public static void main(String[] args) {
       
        int n = 8;
        int[] vector = new int[n];
        
        rellenar(vector);
        imprimir(vector);
    }

    public static void rellenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void imprimir(int[] vector) {
        for (int elemento : vector) {
            System.out.print("[" + elemento + "]");
        }
        System.out.println("");
    }
}
