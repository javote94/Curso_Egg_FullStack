package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void imprimirNombreProducto() throws Exception {
        try {
            ArrayList<Producto> productosArray = dao.listarProductos();

            if (productosArray.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.printf("%-35s\n", "NOMBRE");
                System.out.println("-----------------------");
                for (Producto p : productosArray) {
                    System.out.printf("%-35s\n", p.getNombre());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirNombreYprecioProducto() throws Exception {
        try {
            ArrayList<Producto> productosArray = dao.listarProductos();

            if (productosArray.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.printf("%-35s %-10s\n", "NOMBRE", "PRECIO");
                System.out.println("----------------------------------------------------");
                for (Producto p : productosArray) {
                    System.out.printf("%-35s %-10.2f\n", p.getNombre(), p.getPrecio());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductoPorPrecio(Double precioMin, Double precioMax) throws Exception {
        try {
            ArrayList<Producto> productosArray = dao.listarProductosPorPrecio(precioMin, precioMax);

            if (productosArray.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.printf("%-6s %-35s %-10s %-15s\n", "CODIGO", "NOMBRE", "PRECIO", "CODIGO FABRICANTE");
                System.out.println("-----------------------------------------------------------------------------");
                for (Producto p : productosArray) {
                    System.out.printf("%-6d %-35s %-10.2f %-15d\n", p.getCodigo(), p.getNombre(), p.getPrecio(), p.getCodigoFabricante());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductoPorNombre(String parametro) throws Exception {
        try {
            ArrayList<Producto> productosArray = dao.listarProductosPorNombre(parametro);

            if (productosArray.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.printf("%-6s %-35s %-10s %-15s\n", "CODIGO", "NOMBRE", "PRECIO", "CODIGO FABRICANTE");
                System.out.println("-----------------------------------------------------------------------------");
                for (Producto p : productosArray) {
                    System.out.printf("%-6d %-35s %-10.2f %-15d\n", p.getCodigo(), p.getNombre(), p.getPrecio(), p.getCodigoFabricante());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductoMasBarato() throws Exception {
        try {
            Producto producto = dao.consultarProductoMasBarato();

            if (producto == null) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.printf("%-6s %-35s %-10s %-15s\n", "CODIGO", "NOMBRE", "PRECIO", "CODIGO FABRICANTE");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.printf("%-6d %-35s %-10.2f %-15d\n", producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getCodigoFabricante());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarProducto() throws Exception {
        try {
            Producto producto = new Producto();

            System.out.println("......:INGRESO DE PRODUCTO NUEVO AL INVENTARIO:......");
            System.out.print("Ingresar nombre del producto: ");
            producto.setNombre(leer.next());
            System.out.print("Ingresar precio del producto: ");
            producto.setPrecio(leer.nextDouble());
            System.out.print("Ingresar código del fabricante: ");
            producto.setCodigoFabricante(leer.nextInt());

            System.out.println("Datos del producto a incorporar en el inventario");
            System.out.printf("%-35s %-10s %-15s\n", "NOMBRE", "PRECIO", "CODIGO FABRICANTE");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%-35s %-10.2f %-15d\n", producto.getNombre(), producto.getPrecio(), producto.getCodigoFabricante());

            System.out.print("Confirma la operación?(Y/N): ");
            String confirma = Character.toString(leer.next().charAt(0));

            if (confirma.equalsIgnoreCase("y")) {
                System.out.println("Operación confirmada. El producto fue ingresado al inventario");
                dao.guardarProducto(producto);
            } else if (confirma.equalsIgnoreCase("n")) {
                System.out.println("Operación cancelada. Se retorna al menú");
            } else {
                System.out.println("Opción de confirmación incorrecta. Se retorna al menú");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarPrecioProducto(Integer codigoProducto, Double precioActual, Double precioNuevo) throws Exception {
        try {
            System.out.println(".:MODIFICACIÓN DE PRECIO DE PRODUCTO EN STOCK:.");
            System.out.print("La modificación del precio se realizará en base a los parámetros pasados como argumento.\n"
                    + "Está seguro de realizar la operación?(Y/N): ");

            String confirma = Character.toString(leer.next().charAt(0));

            if (confirma.equalsIgnoreCase("y")) {

                if (codigoProducto == null) {
                    throw new Exception("Debe indicar un código de producto correcto");
                }
                if (precioActual == null || precioActual <= 0 || precioNuevo == null || precioNuevo <= 0) {
                    throw new Exception("Debe indicar un precio de producto correcto");
                }

                Producto producto = dao.buscarProductoPorCodigo(codigoProducto);

                if (producto.getPrecio() != precioActual) {
                    throw new Exception("El precio actual ingresado no es el que está registrado en el sistema para el código de producto indicado");
                }
                producto.setPrecio(precioNuevo);
                dao.modificarProducto(producto);

                System.out.println("Operación confirmada. El precio del producto: " + producto.getNombre() + " fue modificado");
                
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
