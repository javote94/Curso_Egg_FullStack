
package entidades;

public class Cadena {
    
    //Atributos
    private String frase;
    private int longitud;
    
    //Constructor vacío
    public Cadena() {
    }
    
    //Constructor con parámetro
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
    //Getters & Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    
    
}
