package main;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import servicios.LavadoraService;
import servicios.TelevisorService;

public class Main {

    public static void main(String[] args) {

        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();

        List<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(ls.crearLavadora());  //rojo; C; 20; carga: 35 --> 2600
        electrodomesticos.add(ts.crearTelevisor()); //verde; G; 49; resol: 40; sintonizador: true --> 2100
        electrodomesticos.add(ls.crearLavadora());  //azul; B; 79; carga: 30 --> 2600
        electrodomesticos.add(ts.crearTelevisor()); //negro; E; 80; resol: 10; sintonizador: false --> 2300

        double importeTotal = 0;
        for (Electrodomestico e : electrodomesticos) {
            if (e instanceof Televisor) {
                System.out.println("El precio final del televisor es: " + e.precioFinal());
            }
            if (e instanceof Lavadora) {
                System.out.println("El precio final de la lavadora es: " + e.precioFinal());
            }
            importeTotal += e.getPrecio();
        }
        
        System.out.println("El importe total de todos los electrodomésticos es: " + importeTotal);

    }

}
