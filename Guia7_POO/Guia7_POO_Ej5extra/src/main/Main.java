
package main;

import entidades.Cuenta;
import entidades.Bolsillo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Instanciación del objeto de la clase Cuenta
        System.out.println("Ingresar nombre del titular y saldo de inicio de la cuenta bancaria:");
        Cuenta c1 = new Cuenta(leer.next(),leer.nextDouble());
        
        //Instanciación del objeto de la clase Bolsillo (mismo titular)
        System.out.println(c1.getTitular() + ", ingrese la cantidad de efectivo que tiene en el bolsillo:");
        Bolsillo b1 = new Bolsillo(c1.getTitular(),leer.nextDouble());
        
        //Instanciación de un 2do objeto de la clase Bolsillo (otro titular)
        Bolsillo b2 = new Bolsillo("Laura", 150);
        
        System.out.println(c1);
        System.out.println(b1);
        
        c1.retiroDinero(b2);
        
        System.out.println(c1);
        System.out.println(b1);
        System.out.println(b2);
        
    }
}
