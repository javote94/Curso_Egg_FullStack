package entidades;

import enumeraciones.RazaGatuna;

public final class Gato extends Animal {

    //Atributos
    private RazaGatuna raza;
    private final boolean HIPERACTIVIDAD_NOCTURNA = true;

    //Constructores
    public Gato() {
    }

    public Gato(RazaGatuna raza, String nombre, Integer edad, String alimentacion) {
        super(nombre, edad, alimentacion);  //invoca al constructor de la superclase Animal.
        this.raza = raza;
    }

    //Getters & Setters
    public RazaGatuna getRaza() {
        return raza;
    }

    public void setRaza(RazaGatuna raza) {
        this.raza = raza;
    }

    //Método propio de la clase
    public void maullar() {
        System.out.println("Prrrrrrrrr.....");
    }

    //Método abstracto sobreescrito
    @Override
    public String dameDescripcion() {
        return "El gato se llama " + nombre + ", tiene " + edad + " años y su alimentación es " + alimentacion + "."
                + "Es de raza " + raza + " y es hiperactivo por las noches.";
    }

    //Método concreto sobreescrito
    @Override
    public void dormir(int cantidadHoras) {
        super.dormir(cantidadHoras);
        System.out.println("El gato está soñando con trepar las paredes");
    }
    
    
    //Método sobreescrito que proviene de la interfaz Comparable<Animal>
    @Override
    public int compareTo(Animal animal) {
        return edad.compareTo(animal.getEdad());
    }

}
