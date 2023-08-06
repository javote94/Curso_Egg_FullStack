package entidades;

import enumeraciones.RazaGatuna;

public class Gato extends Animal {

    private final RazaGatuna raza;

    public Gato(RazaGatuna raza, String nombre, String alimento, Integer edad) {
        super(nombre, alimento, edad);
        this.raza = raza;
    }

    @Override
    public void alimentarse() {
        System.out.println("Me llamo " + this.nombre + ", soy de raza " + this.raza + " y como " + this.alimento);
    }

}
