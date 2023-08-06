
package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.List;

public class JuegoService {
    
    JugadorService js = new JugadorService();
    
    public Juego crearJuego(){
        return new Juego();
    }
    
    public void llenarJuego(Juego juego, List<Jugador> jugadores, Revolver revolver){  //este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
        System.out.println(juego);
    }
    
    public void ronda(Juego juego, int i){
        Jugador jugador = juego.getJugadores().get(i);
        Revolver revolver = juego.getRevolver();
        System.out.println("El " + jugador.getNombre() + " se apunta el arma y se dispara...");
        js.disparo(jugador, revolver);
    }
    
}
