package servicios;

import entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico crearElectrodomestico() {

        System.out.print("Ingresar color del electrodoméstico (blanco/negro/rojo/azul/gris): ");
        String color = comprobarColor(leer.next());
        System.out.print("Ingresar el tipo de consumo energético (A/B/C/D/E/F): ");
        Character consumo = comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.print("Ingresar el peso del producto (mínimo 1 kg): ");
        Integer peso = leer.nextInt();

        return new Electrodomestico(1000d, color, consumo, peso);
    }

    private static Character comprobarConsumoEnergetico(Character letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    private static String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        } else {
            return "blanco";
        }

    }

}
