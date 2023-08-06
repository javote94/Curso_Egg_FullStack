/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicios;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidad.Comparador;

public class PeliculaService {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.print("Ingresar título de la película: ");
        pelicula.setTitulo(leer.next());
        System.out.print("Ingresar nombre del director de la película: ");
        pelicula.setDirector(leer.next());
        System.out.print("Ingresar cantidad de horas de duración de la película: ");
        pelicula.setDuracion(leer.nextDouble());
        System.out.println(pelicula);
        return pelicula;
    }

    public void ingresarPelicula(ArrayList<Pelicula> peliculasArray) {
        String confirma;
        do {
            peliculasArray.add(crearPelicula());
            System.out.print("Desea ingresar otra película al array?(Y/N): ");
            confirma = Character.toString(leer.next().charAt(0));
            System.out.println("--------------------------------------------");
        } while (confirma.equalsIgnoreCase("y"));
    }

    public void mostrarPeliculas(ArrayList<Pelicula> peliculasArray) {
        for (Pelicula pelicula : peliculasArray) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliculasMayorUnaHora(ArrayList<Pelicula> peliculasArray) {
        System.out.println(".:PELÍCULAS CON UNA DURACIÓN MAYOR A UNA HORA:.");
        Iterator<Pelicula> it = peliculasArray.iterator();
        Pelicula pelicula;
        while (it.hasNext()) {
            pelicula = it.next();
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void mostrarPeliculasPorDuracionDesc(ArrayList<Pelicula> peliculasArray) {
        System.out.println(".:PELÍCULAS ORDENADAS DE ACUERDO A SU DURACIÓN (DE MAYOR A MENOR):.");
        Collections.sort(peliculasArray, Comparador.ordenarPorDuracionDesc);
        mostrarPeliculas(peliculasArray);
    }

    public void mostrarPeliculasPorDuracionAsc(ArrayList<Pelicula> peliculasArray) {
        System.out.println(".:PELÍCULAS ORDENADAS DE ACUERDO A SU DURACIÓN (DE MENOR A MAYOR):.");
        Collections.sort(peliculasArray, Comparador.ordenarPorDuracionAsc);
        mostrarPeliculas(peliculasArray);
    }

    public void mostrarPeliculasPorTitulo(ArrayList<Pelicula> peliculasArray) {
        System.out.println(".:PELÍCULAS ORDENADAS POR TÍTULO (ALFABETICAMENTE):.");
        Collections.sort(peliculasArray, Comparador.ordenarPorTitulo);
        mostrarPeliculas(peliculasArray);
    }

    public void mostrarPeliculasPorDirector(ArrayList<Pelicula> peliculasArray) {
        System.out.println(".:PELÍCULAS ORDENADAS POR DIRECTOR (ALFABETICAMENTE):.");
        Collections.sort(peliculasArray, Comparador.ordenarPorDirector);
        mostrarPeliculas(peliculasArray);
    }

}
