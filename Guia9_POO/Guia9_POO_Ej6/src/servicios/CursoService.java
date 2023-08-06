
package servicios;

import console.Console;
import entidades.Curso;
import java.util.Scanner;

public class CursoService {
    
    private static final int NUM_ALUMNOS = 5;
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String[] cargarAlumnos(){
        String[] nombreAlumnos = new String[NUM_ALUMNOS];
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            Console.print("Nombre del "+(i+1)+"° alumno: ");
            nombreAlumnos[i] = leer.next();
        }
        return nombreAlumnos;
    }
    
    public Curso crearCurso(){
        Console.println(".:CREANDO CURSO:.");
        String nombreCurso = Console.inputStr("Nombre del curso: ");
        Console.println("---[Nombre de los alumnos]---");
        String[] alumnos = cargarAlumnos();
        int horasxDia = Console.inputInt("Cantidad de horas de clase por día: ");
        int diasxSemana = Console.inputInt("Cantidad de días de clase por semana: ");
        double precioxHora = Console.inputDouble("Precio x hora de clase: ");
        String turno = Character.toString(Console.inputChr("Turno mañana o tarde?(M/T): "));
        return new Curso(nombreCurso, alumnos, horasxDia, diasxSemana, precioxHora, turno);
    }
    
    public double calcularGananciaSemanal(Curso curso){
        return curso.getPrecioxHora() * curso.getHorasxDia() * curso.getDiasxSemana() * curso.getAlumnos().length;
    }
}
