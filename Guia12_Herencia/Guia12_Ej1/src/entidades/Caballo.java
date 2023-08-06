package entidades;

import enumeraciones.RazaCaballo;

public final class Caballo extends Animal {

    private final RazaCaballo raza;

    public Caballo(RazaCaballo raza, String nombre, String alimento, Integer edad) {
        super(nombre, alimento, edad);
        this.raza = raza;
    }

    @Override
    public void alimentarse() {
        System.out.println("Me llamo " + this.nombre + ", soy de raza " + this.raza + " y como " + this.alimento);
    }

}
