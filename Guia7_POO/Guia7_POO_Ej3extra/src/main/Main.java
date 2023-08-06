
package main;

import entidad.Console;

public class Main {

    public static void main(String[] args) {
        
        String cadena = Console.input("Ingrese una cadena de texto:");
        
        System.out.println(cadena);
        
        int num = Console.inputInt("Ingrese un número:");
        
        System.out.println(num);
    }
}
