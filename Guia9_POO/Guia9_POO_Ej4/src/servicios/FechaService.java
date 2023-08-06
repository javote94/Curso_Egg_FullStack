
package servicios;

import java.util.Date;
import java.util.Scanner;


public class FechaService {
    
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static Date fechaNacimiento(){
        System.out.print("Año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.print("Día de nacimiento: ");
        int dia = leer.nextInt();
        return new Date(anio - 1900, mes - 1, dia);
    }
    
    public static Date fechaActual(){
        return new Date();
    }
    
    public static int diferenciaAnios(Date fechaActual, Date fechaNacimiento){
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }
    
}
