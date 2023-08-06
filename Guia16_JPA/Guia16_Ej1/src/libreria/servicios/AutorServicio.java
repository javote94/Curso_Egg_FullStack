package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorController;

public class AutorServicio {

    private final AutorController DAOAutor = new AutorController();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Autor crearAutor() throws Exception {
        try {
            System.out.println(".:INGRESO DE AUTOR A LA BASE DE DATOS:.");
            Autor autor = new Autor();
            //******************************Seteo de valores******************************
            //El valor del id se genera automáticamente de manera incremental cuando se persiste en la base de datos
            //Nombre del autor
            System.out.print("Ingresar nombre del autor para guardar en la base de datos: ");
            autor.setNombre(leer.next());
            //Alta del autor
            autor.setAlta(Boolean.TRUE);
            //************************hasta acá finaliza el seteo de valores************************

            DAOAutor.crearAutor(autor);  //se almacena el objeto creado en la base de datos
            return autor;                //se retorna el objeto creado
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void darBajaAutor() throws Exception {
        System.out.println(".:DAR DE BAJA UN AUTOR:.");
        System.out.print("Ingresar nombre del autor que desea dar de baja: ");
        String nombreAutor = leer.next();
        Autor autor = DAOAutor.buscarAutorPorNombre(nombreAutor);
        if (autor != null) {
            autor.setAlta(Boolean.FALSE); //se da de baja el autor pero no lo borramos de la base de datos
            DAOAutor.editarAutor(autor);  //actualiza el estado del autor en la base de datos
        } else {
            throw new Exception("No está registrado un autor con el nombre indicado");
        }
    }
    
    
    public void editarAutor()throws Exception {
        String option;
        do {
            Autor autor = null;
            
            System.out.println("----------------------------------------------------");
            System.out.println(".:EDITAR AUTOR:.");
            System.out.print("Seleccione una opción del menú\n"
                    + "a) Búsqueda del autor por su id\n"
                    + "b) Búsqueda del autor por su nombre\n"
                    + "c) Salir del menú\n"
                    + "Por favor, elegir una opción: ");
            option = Character.toString(leer.next().charAt(0)).toLowerCase();
            System.out.println("----------------------------------------------------");
            
            switch (option) {
                case "a":  //BUSQUEDA DEL AUTOR POR SU ID
                    try {
                        System.out.print("Por favor, ingrese el id del autor que desea editar: ");
                        Integer id = leer.nextInt();
                        autor = DAOAutor.buscarAutorPorId(id);
                    } catch (Exception e) {
                        throw new Exception("No se pudo buscar el autor mediante id", e);
                    }
                    break;
                case "b":  //BUSQUEDA DEL AUTOR POR SU NOMBRE
                    try {
                        System.out.print("Por favor, ingrese el nombre del autor que desea editar: ");
                        String nombreAutor = leer.next();
                        autor = DAOAutor.buscarAutorPorNombre(nombreAutor);
                    } catch (Exception e) {
                        throw new Exception("No se pudo buscar el autor mediante el nombre", e);
                    }
                    break;
                case "c":
                    System.out.println("Saliendo del menú para editar autores...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elegir las opciones disponibles del menú");
            }
            
            if(autor != null) {
                System.out.println("----------------------------------------------------");
                System.out.print("Se ha identificado el autor en la base de datos. "
                        + "Únicamente puedes modificar el atributo nombre.\n"
                        + "Actualmente el nombre del autor es: " + autor.getNombre() + "\n"
                        + "Por favor, ingrese el nuevo nombre que desea asignarle: ");
                String nuevoNombreAutor = leer.next();
                autor.setNombre(nuevoNombreAutor);
                DAOAutor.editarAutor(autor);
                System.out.println("El cambio de nombre se ha realizado con éxito!");   
            } else if (autor == null && !option.equals("c")){
                System.out.println("Lo sentimos. No se ha encontrado el autor en la base de datos.");
            }
        } while (!option.equals("c"));
    }
    
    public Autor buscarAutorPorNombre(String nombreAutor) throws Exception {
        try {
            return DAOAutor.buscarAutorPorNombre(nombreAutor);
        } catch (Exception e) {
            throw new Exception("Error al buscar el autor por nombre: " + e.getMessage(), e);
        }
    }

}
