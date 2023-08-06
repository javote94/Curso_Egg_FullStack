package entidades;

import enumeraciones.RazaPerruna;

public class Perro extends Animal {

    private final RazaPerruna raza;

    public Perro(RazaPerruna raza, String nombre, String alimento, Integer edad) {
        super(nombre, alimento, edad);
        this.raza = raza;
    }

    @Override
    public void alimentarse() {
        System.out.println("Me llamo " + this.nombre + ", soy de raza " + this.raza + " y como " + this.alimento);
    }
}
