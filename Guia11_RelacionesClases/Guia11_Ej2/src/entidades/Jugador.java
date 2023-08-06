package entidades;

public class Jugador {

    //Atributos
    private Integer id;   //representa el n° del jugador.
    private String nombre = "Jugador";
    private boolean mojado;   //indica si está mojado o no el jugador.

    //Constructores
    public Jugador() {
    }
    
    public Jugador(Integer id) {
        this.id = id;
        this.nombre += this.id;
        this.mojado = false;
    }

    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", NOMBRE=" + nombre + ", mojado=" + mojado + '}';
    }

}
