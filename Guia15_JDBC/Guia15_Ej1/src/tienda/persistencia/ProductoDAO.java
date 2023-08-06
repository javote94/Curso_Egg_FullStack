package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public ArrayList<Producto> listarProductos() throws Exception {
        try {
            Producto producto = null;
            ArrayList<Producto> productosArray = new ArrayList();

            String sql = "SELECT * FROM producto";
            consultarBase(sql);

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                productosArray.add(producto);
            }
            desconectarBase();
            return productosArray;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Producto> listarProductosPorPrecio(Double precioMin, Double precioMax) throws Exception {
        try {
            Producto producto = null;
            ArrayList<Producto> productosArray = new ArrayList();

            String sql = "SELECT * FROM producto WHERE precio BETWEEN " + precioMin + " AND " + precioMax + ";";
            consultarBase(sql);

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                productosArray.add(producto);
            }
            desconectarBase();
            return productosArray;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Producto> listarProductosPorNombre(String parametro) throws Exception {
        try {
            Producto producto = null;
            ArrayList<Producto> productosArray = new ArrayList();

            String sql = "SELECT * FROM producto WHERE nombre LIKE '" + parametro + "%'";
            consultarBase(sql);

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                productosArray.add(producto);
            }
            desconectarBase();
            return productosArray;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Producto consultarProductoMasBarato() throws Exception {
        try {
            Producto producto = null;
            
            String sql = "SELECT * FROM producto WHERE precio = (SELECT MIN(precio) FROM producto);";
            consultarBase(sql);
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
            }
            desconectarBase();
            return producto;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public void guardarProducto(Producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES('" + producto.getNombre() + "', " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ");";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            Producto producto = null;

            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + ";";
            consultarBase(sql);

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
            }
            desconectarBase();
            return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto modificado");
            }

            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() + "', "
                    + "precio = " + producto.getPrecio() + ", "
                    + "codigo_fabricante = " + producto.getCodigoFabricante() + " "
                    + "WHERE codigo = " + producto.getCodigo() + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
