
package main;

import entidad.Alumno;
import java.util.ArrayList;
import servicio.AlumnoService;

public class Main {

    
    public static void main(String[] args) {
        
        AlumnoService cs = new AlumnoService();
        
        ArrayList<Alumno> alumnosArray = new ArrayList<>();
        
        cs.ingresarAlumnos(alumnosArray);
        System.out.println(alumnosArray.toString());
        
        double notaFinal = cs.notaFinal(alumnosArray, "Pepe");
        System.out.println("La nota final de Pepe es: " + notaFinal);
    }
    
}
