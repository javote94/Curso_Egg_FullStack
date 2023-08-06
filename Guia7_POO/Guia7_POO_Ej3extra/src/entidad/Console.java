package entidad;

import java.util.Scanner;

public class Console {

    static Scanner leer = new Scanner(System.in);

    public Console() {
    }

    public static int inputInt(String mensaje) {
        System.out.print(mensaje);
        return leer.nextInt();
    }

    public static double inputDouble(String mensaje) {
        System.out.print(mensaje);
        return leer.nextDouble();
    }

    public static String input(String mensaje) {
        System.out.print(mensaje);
        return leer.nextLine();
    }

    public static void print(Object x) {
        System.out.println(x);
    }
}
