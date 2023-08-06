
package servicios;

import entidades.Perro;
import java.util.Scanner;

public class PerroService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        System.out.print("Ingresar nombre del perro: ");
        String nombre = leer.next();
        System.out.print("Ingresar raza del perro: ");
        String raza = leer.next();
        return new Perro(nombre, raza);
    }
    
}
