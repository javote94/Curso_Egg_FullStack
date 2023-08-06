package main;

import entidades.Operacion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion;
        Scanner leer = new Scanner(System.in);

        Operacion objeto = new Operacion();

        objeto.crearOperacion();
        System.out.println(objeto.getNumero1());
        System.out.println(objeto.getNumero2());

        do {

            System.out.println("Ingresar opción"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Salir del menú");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + objeto.suma());
                    break;
                case 2:
                    System.out.println("La resta es: " + objeto.resta());
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + objeto.multiplicacion());
                    break;
                case 4:
                    System.out.println("La división es: " + objeto.division());
                    break;
                case 5:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);
    }
}
