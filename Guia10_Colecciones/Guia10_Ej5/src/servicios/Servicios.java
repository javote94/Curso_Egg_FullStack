package servicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarPais(Set<String> paises) {
        String confirma;
        do {
            System.out.print("Ingresar un país al conjunto: ");
            paises.add(leer.next());
            System.out.print("Desea ingresar otro país?(Y/N): ");
            confirma = Character.toString(leer.next().charAt(0));
            if (confirma.equalsIgnoreCase("n")) {
                break;
            } else if (confirma.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("Opción incorrecta");
                break;
            }
        } while (true);
    }
    
    public void mostrarPaises(Set<String> paises){
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void buscarPais(Set<String> paises){
        System.out.print("Ingresar país a borrar: ");
        String paisBorrar = leer.next();
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            String pais = it.next();
            if (pais.equalsIgnoreCase(paisBorrar)) {
                it.remove();
                break;
            }
        }
    }
}
