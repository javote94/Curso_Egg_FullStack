package servicio;

import entidad.Baraja;
import entidad.Carta;
import enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private CartaService cs = new CartaService();
    private final Integer NUM_MAX = 12;

    public Baraja crearBaraja() {
        System.out.println("Se procede a abrir una baraja de 40 cartas");
        List<Carta> cartas = new ArrayList();
        for (Palo palo : Palo.values()) {
            for (int i = 0; i < NUM_MAX; i++) {
                if ((i + 1) == 8 || (i + 1) == 9) {
                    //nada
                } else {
                    cartas.add(cs.crearCarta(i + 1, palo));
                }
            }
        }
        return new Baraja(cartas);
    }

    public void barajar(Baraja baraja) {
        System.out.println("Barajando el mazo de cartas...");
        Collections.shuffle(baraja.getCartas());
    }

    public void siguienteCarta(Baraja baraja, int i) {
        if (i <= 39) {
            System.out.println("Siguiente carta: " + baraja.getCartas().get(i));
        } else {
            System.out.println("No hay más cartas en la baraja");
        }
    }

    public void darCartas(Baraja baraja) {
        System.out.print("Indicar cantidad de cartas a entregar: ");
        int n = leer.nextInt();
        if (n <= baraja.getCartas().size()) {
            System.out.println("Se entregan las siguientes cartas:");
            for (int i = 0; i < n; i++) {
                System.out.println(baraja.getCartas().get(0));
                baraja.getCartasEntregadas().add(baraja.getCartas().get(0));
                baraja.getCartas().remove(0);
            }
        } else {
            System.out.println("Cartas de la baraja insuficientes. No se entrega cartas al jugador");
            cartasDisponibles(baraja);
        }
    }

    private void cartasDisponibles(Baraja baraja) {
        System.out.println("Cantidad de cartas disponibles en la baraja: " + baraja.getCartas().size());
    }

    public void cartasMonton(Baraja baraja) {
        if (baraja.getCartasEntregadas().size() > 0) {
            for (Carta cartaEntregada : baraja.getCartasEntregadas()) {
                System.out.println(cartaEntregada);
            }
        } else {
            System.out.println("No se te ha entregado ninguna carta hasta el momento");
        }
    }

    public void mostrarBaraja(Baraja baraja) {
        if (baraja.getCartas().size() > 0) {
            for (Carta carta : baraja.getCartas()) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No quedan cartas por mostrar");
        }
    }

}
