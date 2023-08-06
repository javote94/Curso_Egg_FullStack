
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.print("Ingresar nombre: ");
        String nombre = leer.next();
        System.out.print("Ingresar año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.print("Ingresar mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.print("Ingresar dia de nacimiento: ");
        int dia = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return new Persona(nombre, fecha);
    }
    
    public int calcularEdad(Persona persona){
        Date fechaActual = new Date();
        return fechaActual.getYear() - persona.getFechaNacimiento().getYear();
    }
    
    public boolean menorQue(Persona persona, int edad){
        return calcularEdad(persona) < edad;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona);
    }
}
