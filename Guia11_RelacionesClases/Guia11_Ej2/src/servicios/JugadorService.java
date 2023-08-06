package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;

public class JugadorService {
    
    RevolverService rs = new RevolverService();
    
    public Jugador crearJugador(int id){
        return new Jugador(id);    
    }
    
    public void disparo(Jugador jugador, Revolver revolver){
        if(rs.mojar(revolver)){
            System.out.println(jugador.getNombre() + " ¡SE HA MOJADO!");
            jugador.setMojado(true);
        }else{
            System.out.println("El tambor está vacío, se pasa el arma al siguiente jugador");
            rs.siguienteChorro(revolver);
        }
    }
    
}
