
package main;

import entidad.Raices;
import servicio.RaicesServicios;

public class Main {

    public static void main(String[] args) {
        
        RaicesServicios rs = new RaicesServicios();
        Raices ecuacion1 = new Raices(1, 4, 5);
        
        System.out.println("Discriminante: " + rs.getDiscriminante(ecuacion1));
        rs.obtenerRaices(ecuacion1);
        rs.obtenerRaiz(ecuacion1);
        
        
    }
    
}
