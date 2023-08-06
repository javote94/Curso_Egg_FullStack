
package main;

import entidad.Pelicula;
import servicios.PeliculaService;
import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {
        
        PeliculaService cs = new PeliculaService();
        
        ArrayList<Pelicula> peliculasArray = new ArrayList();
        
        cs.ingresarPelicula(peliculasArray);
        
        cs.mostrarPeliculas(peliculasArray);
        
        cs.mostrarPeliculasMayorUnaHora(peliculasArray);
        
        cs.mostrarPeliculasPorDuracionDesc(peliculasArray);
        
        cs.mostrarPeliculasPorDuracionAsc(peliculasArray);
        
        cs.mostrarPeliculasPorTitulo(peliculasArray);
        
        cs.mostrarPeliculasPorDirector(peliculasArray);
    }
    
}
