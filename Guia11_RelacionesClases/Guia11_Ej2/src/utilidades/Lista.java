package utilidades;

import entidades.Jugador;
import java.util.List;
import java.util.Scanner;
import servicios.JugadorService;

public class Lista {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static final JugadorService js = new JugadorService();

    public static void llenarJugadores(List<Jugador> jugadores) {
        int n;
        do {
            System.out.print("Ingresar cantidad de jugadores (máximo 6): ");
            n = leer.nextInt();
        } while (n < 1 || n > 6);

        for (int i = 0; i < n; i++) {
            jugadores.add(js.crearJugador(i + 1));
        }
    }

}
