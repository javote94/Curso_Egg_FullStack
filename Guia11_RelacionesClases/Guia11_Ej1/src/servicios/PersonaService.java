
package servicios;

import entidades.Persona;
import java.util.Scanner;

public class PersonaService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.print("Ingresar nombre de la persona: ");
        String nombre = leer.next();
        return new Persona(nombre);
    }
    
}
