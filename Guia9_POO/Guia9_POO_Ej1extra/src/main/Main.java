
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String[] vectorMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = vectorMeses[2];
        
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String mesUsuario = leer.next();
        
        while (!mesUsuario.equalsIgnoreCase(mesSecreto)) {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            mesUsuario = leer.next();
        }
        
        System.out.println("Ha acertado!");
        
    }
    
}
