
package main;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import enumeraciones.RazaCaballo;
import enumeraciones.RazaGatuna;
import enumeraciones.RazaPerruna;
import java.util.ArrayList;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        
        Animal perro = new Perro(RazaPerruna.BULLDOG, "Fer Chiquito", "carne", 10);
        Animal gato = new Gato(RazaGatuna.PERSA, "Pepa", "pescado", 7);
        Animal caballo = new Caballo(RazaCaballo.ANDALUZ, "Romulo", "pasto", 20);
        
        List<Animal> animalesArray = new ArrayList();
        animalesArray.add(perro);
        animalesArray.add(gato);
        animalesArray.add(caballo);
        
        
        for (Animal animal : animalesArray) {
            animal.alimentarse();
        }
        
    }
    
}
