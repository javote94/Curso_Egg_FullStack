package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("\t.:CREANDO JUEGO DE AHORCADO:.");
        Ahorcado juego = new Ahorcado();
        System.out.print("Ingresar palabra secreta: ");
        juego.setPalabraSecreta(leer.next().toCharArray());
        System.out.print("Ingresar cantidad de jugadas máxima: ");
        juego.setJugadasMaximo(leer.nextInt());
        return juego;
    }

    private static void longitud(Ahorcado juego) {
        System.out.println("Longitud de la palabra: " + juego.getPalabraSecreta().length + " letras");
    }

    private static void buscar(Ahorcado juego, char letra, char[] estadoPalabra) {
        String letraString = Character.toString(letra);                          //pasaje de char a string para usar el método contains.

        if (Arrays.toString(estadoPalabra).contains(letraString)) {
            System.out.println("Mensaje: ya has ingresado esa letra. Por favor, ingrese otra letra");
        } else if (Arrays.toString(juego.getPalabraSecreta()).contains(letraString)) {
            System.out.println("Mensaje: la letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: la letra no pertenece a la palabra");
        }
    }

    private static boolean encontradas(Ahorcado juego, char letra, char[] estadoPalabra) {
        boolean coincidencia = false;
        
        for (int i = 0; i < juego.getPalabraSecreta().length; i++) {
            if (letra == juego.getPalabraSecreta()[i]) {
                coincidencia = true;
                if(letra != estadoPalabra[i]){
                    juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
                    estadoPalabra[i] = letra;
                }
            }
        }

        System.out.println("Número de letras (encontradas, faltantes): ("
                + juego.getLetrasEncontradas() + ","
                + (juego.getPalabraSecreta().length - juego.getLetrasEncontradas()) + ")");
        
        return coincidencia;
    }

    private static void intentos(Ahorcado juego, boolean coincidencia) {
        if (!coincidencia) {
            juego.setJugadasMaximo(juego.getJugadasMaximo() - 1);
        }
        System.out.println("Número de oportunidades restante: " + juego.getJugadasMaximo());
    }

    public void juego(Ahorcado juego) {
        System.out.println("\t.:INICIO DE JUEGO:.");
        char[] estadoPalabra = new char[juego.getPalabraSecreta().length];
        Arrays.fill(estadoPalabra, '-');
        boolean coincidencia;

        do {
            System.out.println("---------------------------------");
            longitud(juego);
            System.out.println(Arrays.toString(estadoPalabra));

            System.out.print("Ingrese una letra: ");
            char letra = leer.next().toLowerCase().charAt(0);

            buscar(juego, letra, estadoPalabra);
            coincidencia = encontradas(juego, letra, estadoPalabra);
            intentos(juego, coincidencia);

        } while (juego.getJugadasMaximo() > 0 && juego.getLetrasEncontradas() != juego.getPalabraSecreta().length);

        if (juego.getJugadasMaximo() > 0) {
            System.out.println("Felicitaciones! Ganaste el juego.");
        } else {
            System.out.println("Lo sentimos, no hay más oportunidades. Perdiste el juego.");
        }

    }

}
