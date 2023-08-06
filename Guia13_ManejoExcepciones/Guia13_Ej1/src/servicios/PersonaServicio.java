package servicios;

import console.Console;
import entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        String nombre = Console.inputStr("Ingresar nombre: ");
        int edad = 0;
        do {
            try {
                System.out.print("Ingresar edad: ");
                edad = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Ingresó un valor incorrecto");
                leer.nextLine();
            }
        } while (edad <= 0);
        char sexo;
        do {
            sexo = Console.inputChr("Ingresar sexo (H/M/O): ");
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        double peso = Console.inputDouble("Ingresar peso: ");
        double altura = Console.inputDouble("Ingresar altura: ");
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEedad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public int calcularIMC(Persona persona) {
        double formulaIMC = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (formulaIMC < 20) {
            return -1;
        } else if (formulaIMC >= 20 && formulaIMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public void mostrarVectorPersona(Persona[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }

    public void mostrarVectorEdad(boolean[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }

    public void mostrarVectorIMC(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }

}
