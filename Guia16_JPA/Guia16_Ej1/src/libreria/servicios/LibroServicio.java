package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroController;

public class LibroServicio {

    private final LibroController DAOLibro = new LibroController();
    private final AutorServicio AS = new AutorServicio();
    private final EditorialServicio ES = new EditorialServicio();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() throws Exception {
        try {
            System.out.println(".:INGRESO DE LIBRO A LA BASE DE DATOS:.");
            Libro libro = new Libro();

            //******************************Seteo de valores******************************
            //ISBN (clave primaria)
            System.out.print("Ingresar ISBN del libro: ");
            libro.setIsbn(leer.nextLong());

            //Título del libro
            System.out.print("Ingresar título del libro: ");
            String tituloLibro = leer.next();
            if (DAOLibro.buscarLibroPorTitulo(tituloLibro) != null) {
                throw new Exception("Existe un libro con el título indicado");
            } else {
                libro.setTitulo(tituloLibro);
            }

            //Año de creación del libro
            System.out.print("Ingresar año de creación del libro: ");
            libro.setAnio(leer.nextInt());

            //Ejemplares del libro (cantidad total, prestados y restantes)
            System.out.print("Ingresar la cantidad total de ejemplares existentes del libro: ");
            libro.setEjemplares(leer.nextInt());

            Integer ejemplaresPrestados;
            do {
                System.out.print("Ingresar cantidad de ejemplares prestados hasta el momento: ");
                ejemplaresPrestados = leer.nextInt();
                if (ejemplaresPrestados > libro.getEjemplares()) {
                    System.out.println("Los ejemplares prestados no pueden superar la cantidad total de ejemplares existentes");
                } else {
                    libro.setEjemplaresPrestados(ejemplaresPrestados);
                }
            } while (ejemplaresPrestados > libro.getEjemplares());

            libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());  //por deducción

            //Alta del libro
            libro.setAlta(Boolean.TRUE);  //se da de alta el objeto

            //Autor del libro
            System.out.print("Ingresar nombre del autor del libro: ");
            String nombreAutor = leer.next();
            Autor autor = AS.buscarAutorPorNombre(nombreAutor);
            if (autor != null) {
                libro.setAutor(autor);
            } else {
                System.out.println("El nombre del autor que acabas de ingresar no se encuentra registrado "
                        + "en la base de datos. Por lo tanto, debemos ingresarlo a la base de datos y "
                        + "posteriormente se asignará de forma automática al libro");
                autor = AS.crearAutor();
                libro.setAutor(autor);
            }

            //Editorial del libro
            System.out.print("Ingresar nombre de la editorial del libro: ");
            String nombreEditorial = leer.next();
            Editorial editorial = ES.buscarEditorialPorNombre(nombreEditorial);
            if (editorial != null) {
                libro.setEditorial(editorial);
            } else {
                System.out.println("El nombre de la editorial que acabas de ingresar no se encuentra registrado "
                        + "en la base de datos. Por lo tanto, debemos ingresarlo a la base de datos y "
                        + "posteriormente se asignará de forma automática al libro");
                editorial = ES.crearEditorial();
                libro.setEditorial(editorial);
            }
            //************************hasta acá finaliza el seteo de valores************************

            DAOLibro.crearLibro(libro);  //se almacena el objeto creado en la base de datos
            return libro;                //se retorna el objeto creado
        } catch (Exception e) {
            throw e;
        }
    }

    public void darBajaLibro() throws Exception {
        System.out.println(".:DAR DE BAJA UN LIBRO:.");
        System.out.print("Ingresar título del libro que desea dar de baja: ");
        String tituloLibro = leer.next();
        Libro libro = DAOLibro.buscarLibroPorTitulo(tituloLibro);
        if (libro != null) {
            libro.setAlta(Boolean.FALSE); //se da de baja el libro pero no lo borramos de la base de datos
            DAOLibro.editarLibro(libro);  //actualiza el estado del libro en la base de datos
        } else {
            throw new Exception("No está registrado un libro con el título indicado");
        }
    }

    public void editarLibro() throws Exception {
        String option;
        String option_atributo;
        do {
            Libro libro = null;
            
            System.out.println("----------------------------------------------------");
            System.out.println(".:EDITAR UN LIBRO:.");
            System.out.print("Seleccione una opción del menú\n"
                    + "a) Búsqueda del libro por su ISBN\n"
                    + "b) Búsqueda del libro por su título\n"
                    + "c) Salir del menú\n"
                    + "Por favor, elegir una opción: ");
            option = Character.toString(leer.next().charAt(0)).toLowerCase();
            System.out.println("----------------------------------------------------");

            switch (option) {
                case "a":  //BUSQUEDA DEL LIBRO POR SU ISBN
                    try {
                        System.out.print("Por favor, ingrese el ISBN del libro que desea editar: ");
                        Long isbn = leer.nextLong();
                        libro = DAOLibro.buscarLibroPorIsbn(isbn);
                    } catch (Exception e) {
                        throw new Exception("No se pudo buscar el libro mediante ISBN", e);
                    }
                    break;
                case "b":  //BUSQUEDA DEL LIBRO POR SU TÍTULO
                    try {
                        System.out.print("Por favor, ingrese el título del libro que desea editar: ");
                        String tituloLibro = leer.next();
                        libro = DAOLibro.buscarLibroPorTitulo(tituloLibro);
                    } catch (Exception e) {
                        throw new Exception("No se pudo buscar el libro mediante el título", e);
                    }
                    break;
                case "c":
                    System.out.println("Saliendo del menú para editar libros...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elegir las opciones disponibles del menú");
            }

            if (libro != null) {
                System.out.println("----------------------------------------------------");
                System.out.print("Se ha identificado el libro en la base de datos. Qué atributo "
                        + "del libro desea editar?\n"
                        + "a) Título\n"
                        + "b) Año de lanzamiento\n"
                        + "c) Autor\n"
                        + "d) Editorial\n"
                        + "Por favor, eliga una opción: ");
                option_atributo = Character.toString(leer.next().charAt(0)).toLowerCase();

                switch (option_atributo) {
                    case "a":
                        System.out.println("Actualmente el título del libro es: " + libro.getTitulo());
                        System.out.print("Ingrese el nuevo título que desea asignarle: ");
                        String tituloLibro = leer.next();
                        libro.setTitulo(tituloLibro);
                        DAOLibro.editarLibro(libro);
                        System.out.println("El cambio del título se ha realizado con éxito!");
                        break;
                    case "b":
                        System.out.println("El año de lanzamiento data de: " + libro.getAnio());
                        System.out.print("Ingrese el nuevo año de lanzamiento que desea asignarle: ");
                        Integer anio = leer.nextInt();
                        libro.setAnio(anio);
                        DAOLibro.editarLibro(libro);
                        System.out.println("El cambio de año de lanzamiento se ha realizado con éxito!");
                        break;
                    case "c":
                        System.out.println("Actualmente el libro está registrado bajo a autoría de: " + libro.getAutor().getNombre());
                        System.out.print("Le solicitamos que ingrese el nombre del nuevo autor. "
                                + "De no estar registrado en la base de datos, se procederá "
                                + "automáticamente a crear una entidad nueva.\n"
                                + "Por favor, ingresar nombre del nuevo autor: ");
                        String nombreAutor = leer.next();
                        Autor autor = AS.buscarAutorPorNombre(nombreAutor);
                        if (autor != null) {
                            System.out.println("El nombre del autor que ingresó está en la base de datos. "
                                    + "Se procede a realizar el cambio de autor");
                            libro.setAutor(autor);
                            DAOLibro.editarLibro(libro);
                        } else {
                            System.out.println("El nombre del autor no está registrado en la base de datos.");
                            Autor autorNuevo = AS.crearAutor();
                            libro.setAutor(autorNuevo);
                            DAOLibro.editarLibro(libro);
                            System.out.println("El cambio de autor se ha realizado con éxito.");
                        }
                        break;
                    case "d":
                        System.out.println("Actualmente el libro está registrado bajo la editorial: " + libro.getEditorial().getNombre());
                        System.out.print("Le solicitamos que ingrese el nombre de la nueva editorial. "
                                + "De no estar registrado en la base de datos, se procederá "
                                + "automáticamente a crear una entidad nueva.\n"
                                + "Por favor, ingresar nombre de la editorial: ");
                        String nombreEditorial = leer.next();
                        Editorial editorial = ES.buscarEditorialPorNombre(nombreEditorial);
                        if (editorial != null) {
                            System.out.println("El nombre de la editorial que ingresó está en la base de datos. "
                                    + "Se procede a realizar el cambio de editorial");
                            libro.setEditorial(editorial);
                            DAOLibro.editarLibro(libro);
                        } else {
                            System.out.println("El nombre de la editorial no está registrado en la base de datos.");
                            Editorial editorialNuevo = ES.crearEditorial();
                            libro.setEditorial(editorialNuevo);
                            DAOLibro.editarLibro(libro);
                            System.out.println("El cambio de la editorial se ha realizado con éxito.");
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } else if (libro == null && !option.equals("c")){
                System.out.println("Lo sentimos. No se ha encontrado el libro en la base de datos.");
            }
        } while (!option.equals("c"));
    }

    public Libro buscarLibroPorIsbn(Long isbn) throws Exception {
        try {
            return DAOLibro.buscarLibroPorIsbn(isbn);
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        try {
            if (titulo == null) {
                throw new Exception("Debe indicar el titulo del libro");
            }
            return DAOLibro.buscarLibroPorTitulo(titulo);
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibrosPorAutor() throws Exception {
        System.out.println("Por favor, ingresar el nombre del autor para acceder a los libros de su autoría: ");
        String nombreAutor = leer.next();
        Autor autor = AS.buscarAutorPorNombre(nombreAutor);
        if (autor != null) {
            List<Libro> libros = DAOLibro.buscarLibrosPorAutor(autor);
            if (libros != null){
                for (Libro l : libros) {
                    System.out.println(l);
                }
            } else {
                System.out.println("El autor " + autor.getNombre() + "no contiene libros en la base de datos");
            }
        } else {
            System.out.println("No se ha encontrado el autor en la base de datos");
        }
    }

    public void buscarLibrosPorEditorial() throws Exception {
        System.out.println("Por favor, ingresar el nombre de la editorial para acceder a sus libros: ");
        String nombreEditorial = leer.next();
        Editorial editorial = ES.buscarEditorialPorNombre(nombreEditorial);
        if (editorial != null) {
            List<Libro> libros = DAOLibro.buscarLibrosPorEditorial(editorial);
            if (libros != null){
                for (Libro l : libros) {
                    System.out.println(l);
                }
            } else {
                System.out.println("La editorial " + editorial.getNombre() + "no contiene libros en la base de datos");
            }
        } else {
            System.out.println("No se ha encontrado la editorial indicada en la base de datos");
        }
    }

}
