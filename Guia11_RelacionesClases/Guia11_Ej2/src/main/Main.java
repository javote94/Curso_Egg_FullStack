package main;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import servicios.JuegoService;
import servicios.JugadorService;
import servicios.RevolverService;
import utilidades.Lista;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Declaración de objeto de servicios para acceder a sus métodos.
        JuegoService juegoServ = new JuegoService();
        JugadorService js = new JugadorService();
        RevolverService rs = new RevolverService();

        //Se crean y alojan los jugadores en una lista.
        List<Jugador> jugadores = new ArrayList();
        Lista.llenarJugadores(jugadores);

        //Se crea y prepara el revolver.
        Revolver revolver = rs.crearRevolver();
        rs.llenarRevolver(revolver);

        //Se crea el juego y se guardan los atributos "jugadores" y "revolver".
        Juego juego = juegoServ.crearJuego();
        juegoServ.llenarJuego(juego, jugadores, revolver);

        //Comienza el juego
        System.out.println(".:COMIENZA LA RULETA RUSA:.");

        int i = 0;
        while (true) {
            if(i == juego.getJugadores().size()){
                i = 0;
            }
            juegoServ.ronda(juego, i);
            if (juego.getJugadores().get(i).getMojado() == true) {
                System.out.println("El " + juego.getJugadores().get(i).getNombre() + " ha perdido");
                break;
            }
            i++;
        }
        System.out.println("El JUEGO HA FINALIZADO");
    }
}
