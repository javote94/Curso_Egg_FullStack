
package main;

import entidades.Puntos;

public class Main {

    
    public static void main(String[] args) {
        
        Puntos p1 = new Puntos();
        Puntos p2 = new Puntos();
        
        p1.crearPunto();
        p2.crearPunto();
        
        System.out.println(p1);
        System.out.println(p2);
        
        double dist = p1.distancia(p2);
        System.out.println("La distancia de p1 con respecto a p2: " + dist);
        
    }
    
}
