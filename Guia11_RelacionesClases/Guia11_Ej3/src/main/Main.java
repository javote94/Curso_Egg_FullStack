package main;

import entidad.Baraja;
import entidad.Carta;
import java.util.Scanner;
import servicio.BarajaService;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        BarajaService bs = new BarajaService();
        
        System.out.println("----------BARAJA DE CARTAS ESPAÑOLAS----------");
        Baraja baraja = bs.crearBaraja();
        
        int i = 0;
        int opcion;
        do {
            System.out.println("\t.:MENÚ.:");
            System.out.println("1. Barajar el mazo"
                    + "\n2. Ver siguiente carta"
                    + "\n3. Pedir cartas"
                    + "\n4. Ver cartas ya usadas"
                    + "\n5. Mostrar baraja"
                    + "\n6. Salir del programa");

            System.out.print("Elegir una opción del menú: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    bs.barajar(baraja);
                    break;
                case 2:
                    bs.siguienteCarta(baraja, i);
                    i++;
                    break;
                case 3:
                    bs.darCartas(baraja);
                    break;
                case 4:
                    bs.cartasMonton(baraja);
                    break;
                case 5:
                    bs.mostrarBaraja(baraja);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error. Opción incorrecta");
            }

        } while (opcion != 6);

        System.out.println("------FIN DEL PROGRAMA------");
    }

}
