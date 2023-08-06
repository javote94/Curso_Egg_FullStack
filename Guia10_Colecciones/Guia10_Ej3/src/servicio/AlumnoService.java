/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {
    
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private static Alumno crearAlumno() {
        Alumno alumno = new Alumno();
        System.out.print("Ingresar nombre del alumno: ");
        alumno.setNombre(leer.next());
        System.out.println(".:Entrada de 3 notas del alumno "+alumno.getNombre()+":.");
        alumno.setNotas(inputNotas(3));
        return alumno;
    }
    
    private static ArrayList<Integer> inputNotas(int nNotas) {
        ArrayList<Integer> notasArray = new ArrayList<>();
        for (int i = 0; i < nNotas; i++) {
            System.out.print("Ingresar " + (i+1) + "° nota: ");
            notasArray.add(leer.nextInt());
        }
        return notasArray;
    }
    
    private static double promedio(Alumno alumno) {
        double suma = 0;
        int n = alumno.getNotas().size();
        for (int i = 0; i < n; i++) {
            suma += alumno.getNotas().get(i);
        }
        return (suma / n);
    }
    
    public void ingresarAlumnos(ArrayList<Alumno> alumnosArray) {
        String confirma;
        Alumno alumno;
        do {
            alumno = crearAlumno();
            System.out.println(alumno.toString());
            alumnosArray.add(alumno);
            System.out.print("Desea ingresar otro alumno al array?(Y/N): ");
            confirma = Character.toString(leer.next().charAt(0));
            System.out.println("--------------------------------");
            
        } while (confirma.equalsIgnoreCase("y"));
    }
    
    public double notaFinal(ArrayList<Alumno> alumnosArray, String nombre){
        for (int i = 0; i < alumnosArray.size(); i++) {
            if(nombre.equalsIgnoreCase(alumnosArray.get(i).getNombre())){
                double notaFinal = promedio(alumnosArray.get(i));
                return notaFinal;
            }
        }
        return 0000000;
    }
    
    
    
}
