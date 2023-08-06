package entidades;

public abstract class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    

    public Animal(String nombre, String alimento, Integer edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
    }

    public abstract void alimentarse();

}
