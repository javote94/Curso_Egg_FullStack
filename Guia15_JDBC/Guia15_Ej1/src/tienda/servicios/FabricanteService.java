
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    
    public void ingresarFabricante() throws Exception {
        try {
            Fabricante fabricante = new Fabricante();
            
            System.out.println("......:INGRESO DE FABRICANTE/PROVEEDOR NUEVO A LA BASE DE DATOS:......");
            System.out.print("Ingresar nombre del proveedor: ");
            fabricante.setNombre(leer.next());
            System.out.print("Ingresar nacionalidad del proveedor: ");
            fabricante.setNacionalidad(leer.next());

            System.out.println("Datos del proveedor a incorporar en la base de datos");
            System.out.printf("%-20s %-20s\n", "NOMBRE", "NACIONALIDAD");
            System.out.println("----------------------------------------------------");
            System.out.printf("%-20s %-20s\n", fabricante.getNombre(), fabricante.getNacionalidad());

            System.out.print("Confirma la operación?(Y/N): ");
            String confirma = Character.toString(leer.next().charAt(0));
            
            if (confirma.equalsIgnoreCase("y")) {
                System.out.println("Operación confirmada. El proveedor fue ingresado a la base de datos");
                dao.guardarFabricante(fabricante);
            } else if (confirma.equalsIgnoreCase("n")) {
                System.out.println("Operación cancelada. Se retorna al menú");
            } else {
                System.out.println("Opción de confirmación incorrecta. Se retorna al menú");
            }
            
        } catch (Exception e) {
            throw e;
        }

    }
    
    
    
    
}
