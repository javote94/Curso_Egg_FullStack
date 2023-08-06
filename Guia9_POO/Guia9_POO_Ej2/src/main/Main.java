package main;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosService;

public class Main {

    public static void main(String[] args) {

        ParDeNumeros objeto = new ParDeNumeros();

        ParDeNumerosService.mostrarValores(objeto);

        System.out.println("El número mayor es: " + ParDeNumerosService.devolverMayor(objeto));
        
        ParDeNumerosService.calcularPotencia(objeto);
        
        ParDeNumerosService.calcularRaiz(objeto);

    }

}
