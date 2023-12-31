package entidades;

public class Persona {
    
    //Atributos
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Perro perro;
    
    //Constructores
    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(String nombre, String apellido, Integer edad, Integer dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }
    
    //Getters & Setters
    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ",\ndni=" + dni + ", perro=" + perro + '}';
    }

}
