package principal.dominio.producto;

import java.util.Collection;
import principal.dominio.fabricante.Fabricante;
import principal.persistencia.ProductoDAO;

public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(String nombreProducto, Double precio, Fabricante fabricante) throws Exception {
        try {
            if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del producto a crear");
            }
            if (precio == null || precio <= 0) {
                throw new Exception("Debe indicar un precio de producto correcto");
            }
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            Producto producto = new Producto();
            producto.setNombre(nombreProducto);
            producto.setPrecio(precio);
            producto.setFabricante(fabricante);
            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrecioProductoPorCodigo(Integer codigo, Double precioActual, Double precioNuevo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar un código de producto correcto");
            }
            if (precioActual == null || precioActual <= 0 || precioNuevo == null || precioNuevo <= 0) {
                throw new Exception("Debe indicar un precio de producto correcto");
            }

            Producto producto = dao.buscarProductoPorCodigo(codigo);

            if (producto.getPrecio() != precioActual) {
                throw new Exception("El precio actual ingresado no es el que está registrado en el sistema para el código de producto indicado");
            }
            producto.setPrecio(precioNuevo);
            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void borrarProductoPorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null || codigo <= 0) {
                throw new Exception("Debe indicar un código de producto correcto");
            }
            dao.eliminarProductoPorCodigo(codigo);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null || codigo <= 0) {
                throw new Exception("Debe indicar el código del producto correctamente");
            }

            Producto producto = dao.buscarProductoPorCodigo(codigo);
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
