/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package guia5;

public class Ej2extra {

    public static void main(String[] args) {
        //  Scanner leer = new Scanner(System.in);

        int vectora[] = new int[4];
        int vectorb[] = new int[4];

        for (int i = 0; i < 4; i++) {

            vectora[i] = (int) (Math.random() * 2);

            vectorb[i] = (int) (Math.random() * 2);

        }

        boolean flag = true;

        int k = 0;

        while ((k < 4) && flag) {
            if (vectora[k] != vectorb[k]) {
                flag = false;
            }
            k = k + 1;
        }

        for (int j = 0; j < 4; j++) {
            System.out.print("[" + vectora[j] + "]");
        }
        System.out.println("");

        for (int j = 0; j < 4; j++) {
            System.out.print("[" + vectorb[j] + "]");
        }
        System.out.println("");

        System.out.println("Los vectores son iguales: " + flag);

    }
}
