package guia5;

import java.util.Scanner;

public class Ej7extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n = 10;
        int[] serieFibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            switch (i) {
                case 0:
                    serieFibonacci[i] = 0;
                    break;
                case 1:
                    serieFibonacci[i] = 1;
                    break;
                default:
                    serieFibonacci[i] = serieFibonacci[i - 1] + serieFibonacci[i - 2];
            }
            System.out.println("[" + serieFibonacci[i] + "]");
        }

    }
}
