package libreria;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        LibroServicio ls = new LibroServicio();
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        Libro libro;
        Autor autor;
        Editorial editorial;

        String option;
        do {  //BUCLE PRINCIPAL
            System.out.println("----------------------------------------------------");
            System.out.println(".:MENÚ PRINCIPAL:.");
            System.out.print("a) Ingresar libro/autor/editorial a la base de datos\n"
                    + "b) Dar de baja un libro/autor/editorial\n"
                    + "c) Editar un libro/autor/editorial\n"
                    + "d) Búsqueda de un autor por su nombre\n"
                    + "e) Búsqueda de un libro por su ISBN\n"
                    + "f) Búsqueda de un libro por su título\n"
                    + "g) Búsqueda de un libro/s por nombre del autor\n"
                    + "h) Búsqueda de un libro/s por nombre de la editorial\n"
                    + "i) Salir del programa\n"
                    + "Ingrese una opción disponible del menú: ");
            option = Character.toString(leer.next().charAt(0)).toLowerCase();
            System.out.println("----------------------------------------------------");

            switch (option) {  //SWITCH PRINCIPAL
                case "a":  //Ingresa libro/autor/editorial
                    String option_a;
                    String confirm_a;
                    do {
                        confirm_a = "";
                        System.out.print("Elegir entidad a ingresar a la base de datos:\n"
                                + "a) Libro\n"
                                + "b) Autor\n"
                                + "c) Editorial\n"
                                + "d) Volver al menú principal\n"
                                + "Ingrese una opción disponible: ");
                        option_a = Character.toString(leer.next().charAt(0)).toLowerCase();
                        switch (option_a) {
                            case "a":  //Ingresa libro
                                libro = ls.crearLibro();
                                System.out.println(libro);
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea ingresar otra entidad a la base de datos?(Y/N): ");
                                confirm_a = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "b":  //Ingresa autor
                                autor = as.crearAutor();
                                System.out.println(autor);
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea ingresar otra entidad a la base de datos?(Y/N): ");
                                confirm_a = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "c":  //Ingresa editorial
                                editorial = es.crearEditorial();
                                System.out.println(editorial);
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea ingresar otra entidad a la base de datos?(Y/N): ");
                                confirm_a = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "d":  //vuelve a menú
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción incorrecta. Por favor, elegir las opciones disponibles del menú");
                        }
                    } while (!option_a.equals("d") && !confirm_a.equals("n"));
                    break;
                case "b":
                    String option_b;
                    String confirm_b;
                    do {
                        confirm_b = "";
                        System.out.print("Elegir entidad a dar de baja:\n"
                                + "a) Libro\n"
                                + "b) Autor\n"
                                + "c) Editorial\n"
                                + "d) Volver al menú principal\n"
                                + "Ingrese una opción disponible: ");
                        option_b = Character.toString(leer.next().charAt(0)).toLowerCase();
                        switch (option_b) {
                            case "a":  //Borrar libro
                                ls.darBajaLibro();
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea dar de baja otra entidad?(Y/N): ");
                                confirm_b = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "b":  //Borrar autor
                                as.darBajaAutor();
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea dar de baja otra entidad?(Y/N): ");
                                confirm_b = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "c":  //Borrar editorial
                                es.darBajaEditorial();
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea dar de baja otra entidad?(Y/N): ");
                                confirm_b = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "d":  //vuelve a menú
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción incorrecta. Por favor, elegir las opciones disponibles del menú");
                        }
                    } while (!option_b.equals("d") && !confirm_b.equals("n"));
                    break;
                case "c":
                    String option_c;
                    String confirm_c;
                    do {
                        confirm_c = "";
                        System.out.print("Elegir entidad a editar:\n"
                                + "a) Libro\n"
                                + "b) Autor\n"
                                + "c) Editorial\n"
                                + "d) Volver al menú principal\n"
                                + "Ingrese una opción disponible: ");
                        option_c = Character.toString(leer.next().charAt(0)).toLowerCase();
                        switch (option_c) {
                            case "a":
                                ls.editarLibro();
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea editar otra entidad?(Y/N): ");
                                confirm_c = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "b":
                                as.editarAutor();
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea editar otra entidad?(Y/N): ");
                                confirm_c = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "c":
                                es.editarEditorial();
                                System.out.println("---------------------------------------------------");
                                System.out.print("Desea editar otra entidad?(Y/N): ");
                                confirm_c = Character.toString(leer.next().charAt(0)).toLowerCase();
                                break;
                            case "d":
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción incorrecta. Por favor, elegir las opciones disponibles del menú");
                        }
                    } while (!option_c.equals("d") && !confirm_c.equals("n"));
                    break;
                case "d":
                    System.out.print("Por favor, ingresar nombre del autor que desea buscar en la base de datos: ");
                    String nombreAutor = leer.next();
                    autor = as.buscarAutorPorNombre(nombreAutor);
                    System.out.println("---------------------------------------------------");
                    if (autor != null) {
                        System.out.println(autor);
                    } else {
                        System.out.println("No se ha encontrado el autor en la base de datos");
                    }
                    break;
                case "e":
                    System.out.print("Por favor, ingresar el ISBN del libro que desea buscar en la base de datos: ");
                    Long isbn = leer.nextLong();
                    libro = ls.buscarLibroPorIsbn(isbn);
                    System.out.println("---------------------------------------------------");
                    if (libro != null) {
                        System.out.println(libro);
                    } else {
                        System.out.println("No se ha encontrado el libro en la base de datos");
                    }
                    break;
                case "f":
                    System.out.print("Por favor, ingresar el titulo del libro que desea buscar en la base de datos: ");
                    String tituloLibro = leer.next();
                    libro = ls.buscarLibroPorTitulo(tituloLibro);
                    System.out.println("---------------------------------------------------");
                    if (libro != null) {
                        System.out.println(libro);
                    } else {
                        System.out.println("No se ha encontrado el libro en la base de datos");
                    }
                    break;
                case "g":
                    ls.buscarLibrosPorAutor();
                    break;
                case "h":
                    ls.buscarLibrosPorEditorial();
                    break;
                case "i":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elegir las opciones disponibles del menú");
            }

        } while (!option.equals("i"));

        System.out.println("HASTA LUEGO!");

    }

}
