
package main;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena1 = cs.crearCadena();
        
        cs.mostrarVocales(cadena1);
        
        cs.invertirFrase(cadena1);
        
        System.out.print("Ingresar caracter para contabilizar repeticiones en la cadena: ");
        cs.vecesRepetido(cadena1, leer.next().charAt(0));
        
        System.out.print("Ingresar una frase para comparar su longitud con la cadena: ");
        cs.compararLongitud(cadena1, leer.next());
        
        System.out.print("Ingresar una frase para concatenar con la cadena: ");
        cs.unirFrases(cadena1, leer.next());
        
        System.out.print("Ingresar caracter que reemplazará la letra 'a' de la cadena: ");
        cs.reemplazar(cadena1, leer.next().charAt(0));
        
        System.out.print("Ingresar caracter para comprobar si está en la cadena: ");
        cs.contiene(cadena1, Character.toString(leer.next().charAt(0)));
    }
    
}
