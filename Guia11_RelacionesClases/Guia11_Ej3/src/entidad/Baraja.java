
package entidad;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
    
    //Atributos
    private List<Carta> cartas;
    private List<Carta> cartasEntregadas;
    
    //Constructores
    public Baraja() {
        this.cartas = new ArrayList();
        this.cartasEntregadas = new ArrayList();
    }

    public Baraja(List<Carta> cartas) {
        this.cartas = cartas;
        this.cartasEntregadas = new ArrayList();
    }
    
    //Getters & Setters
    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Carta> getCartasEntregadas() {
        return cartasEntregadas;
    }

    public void setCartasEntregadas(List<Carta> cartasEntregadas) {
        this.cartasEntregadas = cartasEntregadas;
    }
    
    //toString
    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
    
}
