
package servicio;

import entidad.Carta;
import enumeraciones.Palo;

public class CartaService {
    
    public Carta crearCarta(Integer num, Palo palo){
        return new Carta(num, palo);
    }
    
}
