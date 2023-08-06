/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<String> razaArray = new ArrayList();
        
        
        char val;
        do {
            
            System.out.print("Ingresar raza de perro: ");
            razaArray.add(leer.next());
            
            System.out.print("Queres ingresar otra raza a la lista?(Y/N): ");
            val = leer.next().charAt(0);
            
        } while (val == 'Y' || val == 'y');
        
        System.out.println("Cantidad de elementos: " + razaArray.size());
        for (String raza : razaArray) {
            System.out.println("[" + raza + "]");
        }
        
        /*
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        la lista ordenada.
        */
                
        System.out.print("Ingresar una raza de la lista: ");
        String raza = leer.next();
        
        Iterator<String> it = razaArray.iterator();
        
        boolean log = true;
        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase(raza)){
                it.remove();
                log = false; 
            }
        }
        
        if(log){
            System.out.println("La raza no se encuentra en la lista");
        }
        
        Collections.sort(razaArray);
        
        for (String aux : razaArray) {
            System.out.println("[" + aux + "]");
        }
        
    }
    
}
