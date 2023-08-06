
package main;

import servicios.ArregloService;


public class Main {

    
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        System.out.println(".:ARREGLO A (ORDEN ALEATORIO):.");
        ArregloService.inicializarA(arregloA);
        ArregloService.mostrarArreglo(arregloA);
        
        System.out.println("------------------------");
        System.out.println(".:ARREGLO A (ORDEN DESCENDENTE):.");
        ArregloService.ordenarArreglo(arregloA);
        ArregloService.mostrarArreglo(arregloA);
        
        System.out.println("------------------------");
        System.out.println(".:ARREGLO B:.");
        ArregloService.inicializarB(arregloB, arregloA);
        ArregloService.mostrarArreglo(arregloB);
    }
    
}
