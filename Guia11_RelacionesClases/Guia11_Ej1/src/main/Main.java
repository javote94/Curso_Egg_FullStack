package main;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import servicios.PerroService;
import servicios.PersonaService;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaService persoServ = new PersonaService();
        PerroService perroServ = new PerroService();
        List<Persona> personas = new ArrayList();
        List<Perro> perros = new ArrayList();
        Iterator<Perro> iteratorPerros = perros.iterator();
        
        //Creamos los perros y los guardamos en un ArrayList
        int n = 3;
        for (int i = 0; i < n; i++) {
            perros.add(perroServ.crearPerro());
        }
        
        
        String nombrePerro;
        for (int i = 0; i < n; i++) {
            
            personas.add(persoServ.crearPersona());  //Creamos las personas y los guardamos en un ArrayList.
            
            System.out.println(personas.get(i).getNombre() + ", le presentamos los perros disponibles para adoptar.");
            for (Perro perro : perros) {
                System.out.println("Nombre: " + perro.getNombre() + "; Raza: " + perro.getRaza());
            }
            
            System.out.print("Ingrese el nombre del perro que desea adoptar: ");
            nombrePerro = leer.next();
            
            while (iteratorPerros.hasNext()) {  //Recorremos el ArrayList de perros con un Iterator.
                Perro perro = iteratorPerros.next();
                if(perro.getNombre().equalsIgnoreCase(nombrePerro)){
                    System.out.println("Felicitaciones! Usted acaba de adoptar a " + perro.getNombre() + "(" + perro.getRaza() + ")");
                    personas.get(i).setPerro(perro);
                    iteratorPerros.remove();
                    break;
                }else{
                    System.out.println("Ha ingresado un nombre incorrecto.");
                }
            }
            System.out.println("-------------------------------------------------------------------");
        }
        
        System.out.println(".:MOSTRAMOS TODAS LAS PERSONAS CON SUS RESPECTIVOS PERROS:.");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
    }

}
