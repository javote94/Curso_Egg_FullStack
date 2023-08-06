package entidad;

import enumeraciones.Palo;

public class Carta {

    //Atributos
    private Integer numero;
    private Palo palo;

    //Constructores
    public Carta() {
    }

    public Carta(Integer numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    //Getters & Setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    //toString
    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }

}
