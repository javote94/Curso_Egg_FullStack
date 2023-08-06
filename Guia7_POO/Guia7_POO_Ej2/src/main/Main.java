
package main;

import entidades.Circunferencia;

public class Main {
    
    public static void main(String[] args) {
        
        Circunferencia circulo = new Circunferencia();
        
        circulo.crearCircunferencia();
        System.out.println(circulo.getRadio());
        
        System.out.println("El área es: " + circulo.area());
        System.out.println("El perímetro es: " + circulo.perimetro());
        
        System.out.println(circulo.toString());
    }
}
