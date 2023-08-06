/*
Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 */
package tienda.main;

import java.util.Scanner;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

public class MainClass {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        FabricanteService fs = new FabricanteService();
        ProductoService ps = new ProductoService();

        String opcionConsulta;
        do {
            System.out.print("......................:MENÚ DE OPCIONES:......................\n"
                    + "a) Solicito nombre de todos los productos disponibles en stock\n"
                    + "b) Solicito nombre y precio de todos lo productos disponibles en stock\n"
                    + "c) Solicito listado de productos con precio entre $120 y $202 en stock\n"
                    + "d) Solicito listado de Portátiles en stock\n"
                    + "e) Solicito nombre y precio del producto más barato en stock\n"
                    + "f) Ingresar un producto al inventario\n"
                    + "g) Ingresar un proveedor a la base de datos\n"
                    + "h) Modificar el precio de un producto en stock\n"
                    + "i) Salir del menú\n"
                    + "Por favor, ingresar una opción del menú: ");

            opcionConsulta = leer.next().toLowerCase();

            switch (opcionConsulta) {
                case "a":
                    ps.imprimirNombreProducto();
                    break;
                case "b":
                    ps.imprimirNombreYprecioProducto();
                    break;
                case "c":
                    ps.imprimirProductoPorPrecio(120d, 202d);
                    break;
                case "d":
                    ps.imprimirProductoPorNombre("Port");
                    break;
                case "e":
                    ps.imprimirProductoMasBarato();
                    break;
                case "f":
                    ps.ingresarProducto();
                    break;
                case "g":
                    fs.ingresarFabricante();
                    break;
                case "h":
                    ps.modificarPrecioProducto(17, 23.4, 2655.77);
                    break;
                case "i":
                    System.out.println("Está saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, ingrese las opciones disponibles en el menú");
            }

        } while (!opcionConsulta.equalsIgnoreCase("i"));
        
        System.out.println("Ha finalizado el programa. Muchas gracias.");

    }

}
