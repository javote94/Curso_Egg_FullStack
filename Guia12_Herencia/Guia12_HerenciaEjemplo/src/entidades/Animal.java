package entidades;

public abstract class Animal implements Comparable<Animal>{

    //Atributos
    protected String nombre;
    protected Integer edad;
    protected String alimentacion;

    //Constructores
    public Animal() {
    }

    public Animal(String nombre, Integer edad, String alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimentacion = alimentacion;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    //Método abstracto
    public abstract String dameDescripcion();
    
    //Método concreto
    public void dormir(int cantidadHoras) {
        System.out.println(this.nombre + " durmió " + cantidadHoras + " horas");
    }

}
