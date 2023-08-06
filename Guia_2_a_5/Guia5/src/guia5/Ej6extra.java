/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

public class Ej6extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        String frase;
        int fila, columna, contador = 0;
        
        char[][] sopaLetras = new char[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopaLetras[i][j] = String.valueOf(random.nextInt(10)).charAt(0);
            }
        }

        do {
            do {
                System.out.print("Ingresar frase de 3 a 5 caracteres: ");
                frase = leer.next();
            } while (frase.length() < 3 || frase.length() > 5);
            
            contador ++;
            System.out.println(contador + "° frase ingresada");
            
            fila = random.nextInt(20);
            columna = random.nextInt(16);
            for (int k = 0; k < frase.length(); k++) {
                sopaLetras[fila][columna] = frase.charAt(k);
                columna++;
            }
            
        } while (contador < 5);

        for (char[] vectorFila : sopaLetras) {
            for (char elemento : vectorFila) {
                System.out.print(" [ " + elemento + " ] ");
            }
            System.out.println("");
        }

    }
}
