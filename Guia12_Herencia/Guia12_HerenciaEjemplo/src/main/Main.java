package main;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import enumeraciones.RazaGatuna;
import enumeraciones.RazaPerruna;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Instanciación de las clases Perro y Gato (subclases que heredan de la superclase Animal)
        Perro perro1 = new Perro(RazaPerruna.LABRADOR, "Fer Chiquito", 5, "carne");
        Perro perro2 = new Perro(RazaPerruna.PASTOR_ALEMAN, "Cuca", 12, "croquetas");

        Gato gato1 = new Gato(RazaGatuna.SIAMÉS, "Rosita", 9, "pescado");
        Gato gato2 = new Gato(RazaGatuna.PERSA, "Tina", 3, "pollo");
        
        System.out.println(perro1.dameDescripcion());
        System.out.println(gato1.dameDescripcion());

        System.out.println("------------------------------------");

        //POLIMORFISMO
        //El array de tipo Animal (superclase) acepta objetos instanciados de las subclases (perro y gato).
        List<Animal> animalesArray = new ArrayList();
        animalesArray.add(perro1);
        animalesArray.add(perro2);
        animalesArray.add(gato1);
        animalesArray.add(gato2);

        for (Animal animal : animalesArray) {
            animal.dormir(8);    //dormir() es un método declarado en la superclase y sobreescrito en las subclases.
        }                        //al compilar el programa, el objeto de tipo animal invoca el método sobreescrito de una u otra subclase según corresponda.

        //¿Pero si quiero acceder a los métodos particulares de las subclases Perro y Gato recorriendo el array de objetos de tipo Animal? [ladrar() y maullar()]
        //No se puede acceder a esos métodos desde el objeto de la superclase Animal porque no fueron definidos allí.
        //Para solucionar esto debemos hacer un casteo de la superclase Animal a la sublcase correspondiente para tener acceso a los métodos particulares.
        for (Animal animal : animalesArray) {
            
            if (animal instanceof Gato) {      //si el objeto animal fue instanciado en base a la clase Gato...
                Gato g = (Gato) animal;        //casteo a la clase Gato
                g.maullar();                   //accedo al método maullar() que pertenece exclusivamente a la clase Gato.
            }
            
            if(animal instanceof Perro){
                Perro p = (Perro) animal;
                p.ladrar();
            }
        }
        
        System.out.println("------------------------------------");
        
        //INTERFAZ
        //Si queremos ordenar el array de objetos Animal según el atributo edad, la superclase Animal debe implementar 
        //la interfaz predefinida en la API de JAVA que se llama Comparable<> y, posteriormente, sobreescribir el método 
        //abstracto compareTo() en las subclases Perro y Gato. Esto es posible ya que, al igual que las clases, las interfaces
        //se heredan.
        //De esta forma, podemos usar adecuadamente el método estático sort() de la clase Collections.
        
        for (Animal animal : animalesArray) {
            System.out.println("Nombre: " + animal.getNombre() + ", Edad: " + animal.getEdad());
        }
        
        Collections.sort(animalesArray);
        
        for (Animal animal : animalesArray) {
            System.out.println("Nombre: " + animal.getNombre() + ", Edad: " + animal.getEdad());
        }

    }

}
