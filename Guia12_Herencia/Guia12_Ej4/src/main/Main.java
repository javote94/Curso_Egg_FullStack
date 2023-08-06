package main;

import entidades.Circulo;
import entidades.Rectangulo;

public class Main {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(4.6, 9.2);
        Rectangulo rectangulo = new Rectangulo(11.2, 3.4);
        
        System.out.println(".:CÍRCUNFERENCIA:."
                + "\nÁrea: " + circulo.calculoArea() + ""
                + "\nPerímetro: " + circulo.calculoPerimetro());
        
        System.out.println(".:RECTÁNGULO:."
                + "\nÁrea: " + rectangulo.calculoArea() + ""
                + "\nPerímetro: " + rectangulo.calculoPerimetro());
        
    }
}
