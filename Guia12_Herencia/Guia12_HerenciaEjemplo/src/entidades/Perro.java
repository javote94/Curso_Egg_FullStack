package entidades;

import enumeraciones.RazaPerruna;

public final class Perro extends Animal {

    //Atributos
    private RazaPerruna raza;
    private final boolean AFECTUOSO = true;

    //Constructores
    public Perro() {
    }

    public Perro(RazaPerruna raza, String nombre, Integer edad, String alimentacion) {
        super(nombre, edad, alimentacion);  //invoca al constructor de la superclase Animal.
        this.raza = raza;
    }

    //Getters & Setters
    public RazaPerruna getRaza() {
        return raza;
    }

    public void setRaza(RazaPerruna raza) {
        this.raza = raza;
    }

    //Método propio de la clase
    public void ladrar() {
        System.out.println("Guauuu!");
    }
    
    //Método abstracto sobreescrito
    @Override
    public String dameDescripcion() {
        return "El perro se llama " + nombre + ", tiene " + edad + " años y su alimentación es " + alimentacion + "."
                + "Es de raza " + raza + " y es afectuoso.";
    }
    
    //Método concreto sobreescrito
    @Override
    public void dormir(int cantidadHoras) {
        super.dormir(cantidadHoras);
        System.out.println("El perro está soñando con su pelota");
    }
    
    //Método sobreescrito que proviene de la interfaz Comparable<Animal>
    @Override
    public int compareTo(Animal animal) {
        return edad.compareTo(animal.getEdad());
    }

}
