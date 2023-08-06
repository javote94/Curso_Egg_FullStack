package main;

import java.util.Date;
import servicios.FechaService;

public class Main {

    public static void main(String[] args) {

        Date fechaNacimiento = FechaService.fechaNacimiento();
        System.out.println(fechaNacimiento);
        
        Date fechaActual = FechaService.fechaActual();
        System.out.println(fechaActual);
        
        int edadUsuario = FechaService.diferenciaAnios(fechaActual, fechaNacimiento);
        System.out.println("La edad del usuario es: " + edadUsuario);
    }

}
