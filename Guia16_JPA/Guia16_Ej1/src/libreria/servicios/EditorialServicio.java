package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialController;

public class EditorialServicio {

    private final EditorialController DAOEditorial = new EditorialController();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Editorial crearEditorial() throws Exception {
        try {
            System.out.println(".:INGRESO DE EDITORIAL A LA BASE DE DATOS:.");
            Editorial editorial = new Editorial();
            //******************************Seteo de valores******************************
            //El valor del id se genera automáticamente de manera incremental cuando se persiste en la base de datos
            //Nombre de la editorial
            System.out.print("Ingresar nombre de la editorial para guardar en la base de datos: ");
            editorial.setNombre(leer.next());
            //Alta del autor
            editorial.setAlta(Boolean.TRUE);
            //************************hasta acá finaliza el seteo de valores************************
            
            DAOEditorial.crearEditorial(editorial);  //se almacena el objeto creado en la base de datos
            return editorial;                        //se retorna el objeto creado
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void darBajaEditorial() throws Exception {
        System.out.println(".:DAR DE BAJA UNA EDITORIAL:.");
        System.out.print("Ingresar nombre de la editorial que desea dar de baja: ");
        String nombreEditorial = leer.next();
        Editorial editorial = DAOEditorial.buscarEditorialPorNombre(nombreEditorial);
        if (editorial != null) {
            editorial.setAlta(Boolean.FALSE);               //se da de baja la editorial pero no lo borramos de la base de datos
            DAOEditorial.editarEditorial(editorial);       //actualiza el estado del autor en la base de datos
        } else {
            throw new Exception("No está registrado un autor con el nombre indicado");
        }
    }
    
    public void editarEditorial()throws Exception {
        String option;
        do {
            Editorial editorial = null;
            
            System.out.println("----------------------------------------------------");
            System.out.println(".:EDITAR EDITORIAL:.");
            System.out.print("Seleccione una opción del menú\n"
                    + "a) Búsqueda del editorial por su id\n"
                    + "b) Búsqueda del editorial por su nombre\n"
                    + "c) Salir del menú\n"
                    + "Por favor, elegir una opción: ");
            option = Character.toString(leer.next().charAt(0)).toLowerCase();
            System.out.println("----------------------------------------------------");
            
            switch (option) {
                case "a":  //BUSQUEDA DE LA EDITORIAL POR SU ID
                    try {
                        System.out.print("Por favor, ingrese el id de la editorial que desea editar: ");
                        Integer id = leer.nextInt();
                        editorial = DAOEditorial.buscarEditorialPorId(id);
                    } catch (Exception e) {
                        throw new Exception("No se pudo buscar la editorial mediante id", e);
                    }
                    break;
                case "b":  //BUSQUEDA DE LA EDITORIAL POR SU NOMBRE
                    try {
                        System.out.print("Por favor, ingrese el nombre de la editorial que desea editar: ");
                        String nombreEditorial = leer.next();
                        editorial = DAOEditorial.buscarEditorialPorNombre(nombreEditorial);
                    } catch (Exception e) {
                        throw new Exception("No se pudo buscar la editorial mediante el nombre", e);
                    }
                    break;
                case "c":
                    System.out.println("Saliendo del menú para editar editoriales...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elegir las opciones disponibles del menú");
            }
            
            if(editorial != null) {
                System.out.println("----------------------------------------------------");
                System.out.print("Se ha identificado una editorial en la base de datos. "
                        + "Únicamente puedes modificar el atributo nombre.\n"
                        + "Actualmente el nombre de la editorial es: " + editorial.getNombre() + "\n"
                        + "Por favor, ingrese el nuevo nombre que desea asignarle: ");
                String nuevoNombreEditorial = leer.next();
                editorial.setNombre(nuevoNombreEditorial);
                DAOEditorial.editarEditorial(editorial);
                System.out.println("El cambio de nombre se ha realizado con éxito!");   
            } else if (editorial == null && !option.equals("c")){
                System.out.println("Lo sentimos. No se ha encontrado el autor en la base de datos.");
            }
        } while (!option.equals("c"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Editorial buscarEditorialPorNombre(String nombreEditorial) throws Exception {
        try {
            if (nombreEditorial == null) {
                throw new Exception("Debe indicar el nombre de la editorial");
            }
            return DAOEditorial.buscarEditorialPorNombre(nombreEditorial);
        } catch (Exception e) {
            throw e;
        }
    }

}
