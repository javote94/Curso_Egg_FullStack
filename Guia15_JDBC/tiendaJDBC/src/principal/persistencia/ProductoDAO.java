package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.dominio.fabricante.Fabricante;
import principal.dominio.producto.Producto;

public final class ProductoDAO extends DAO {

    private FabricanteDAO daoFabricante = new FabricanteDAO();

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES('" + producto.getNombre() + "', " + producto.getPrecio() + ", " + producto.getFabricante().getCodigo() + ");";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
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
                    + "codigo_fabricante = " + producto.getFabricante().getCodigo() + " "
                    + "WHERE codigo = " + producto.getCodigo() + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProductoPorCodigo(int codigo) throws Exception {
        try {
            if (codigo <= 0) {
                throw new Exception("Debe indicar un código de producto correcto");
            }

            String sql = "DELETE FROM producto WHERE codigo = " + codigo + ";";
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

                Integer codigo_fabricante = resultado.getInt("codigo_fabricante");
                Fabricante fabricante = daoFabricante.buscarFabricantePorCodigo(codigo_fabricante);
                producto.setFabricante(fabricante);
            }
            desconectarBase();
            return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productosArray = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));

                Integer codigo_fabricante = resultado.getInt("codigo_fabricante");
                Fabricante fabricante = daoFabricante.buscarFabricantePorCodigo(codigo_fabricante);
                producto.setFabricante(fabricante);

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

    /*
    public Producto buscarProductoPorCodigo2(int codigo) throws Exception {
        try {
            Producto producto = null;
            Fabricante fabricante = null;
            
            String sql = "SELECT * FROM producto p INNER JOIN fabricante f ON "
                    + "p.codigo_fabricante = f.codigo WHERE p.codigo = " + codigo + ";";
            consultarBase(sql);
            
            while (resultado.next()) {                
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                
                //falta codigo
            }
            desconectarBase();
            return producto;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
     */
}
