package servicio;

import java.util.Map;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarElemento(Map<String, Integer> productos) {
        String confirma;
        do {
            System.out.println("Ingresar producto: ");
            String producto = leer.next();
            System.out.println("Ingresar precio: ");
            Integer precio = leer.nextInt();
            productos.put(producto, precio);
            System.out.print("Desea ingresar otro producto al mapa?(Y/N): ");
            confirma = Character.toString(leer.next().charAt(0));
            System.out.println("------------------------------------");
        } while (!confirma.equalsIgnoreCase("n"));

    }
    
    public void modificarPrecio(Map<String, Integer> productos){
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
        }
    }

}
