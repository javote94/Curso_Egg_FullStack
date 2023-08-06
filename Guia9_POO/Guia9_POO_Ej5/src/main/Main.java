
package main;

import entidades.Persona;
import servicios.PersonaService;

public class Main {

    public static void main(String[] args) {
        
        PersonaService cs = new PersonaService();
        
        Persona persona1 = cs.crearPersona();
        System.out.println("La edad es: " + cs.calcularEdad(persona1));
        System.out.println("La edad de la persona es menor que 25: " + cs.menorQue(persona1, 25));
        cs.mostrarPersona(persona1);
    }
    
}
