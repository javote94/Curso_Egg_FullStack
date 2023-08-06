package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.dominio.fabricante.Fabricante;

public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String sql = "INSERT INTO fabricante (nombre, nacionalidad)"
                    + "VALUES ('" + fabricante.getNombre() + "', '" + fabricante.getNacionalidad() + "');";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante que desea modificar");
            }

            String sql = "UPDATE fabricante SET "
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = " + fabricante.getCodigo() + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarFabricantePorCodigo(int codigo) throws Exception {
        try {
            if (codigo <= 0) {
                throw new Exception("Debe indicar un código de fabricante correcto");
            }

            String sql = "DELETE FROM fabricante WHERE codigo = " + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarFabricantePorNombre(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar el nombre nuevo");
            }

            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

    }

    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception {
        try {
            Fabricante fabricante = null;

            String sql = "SELECT * FROM fabricante WHERE codigo = " + codigo + ";";
            consultarBase(sql);  //el resultado de la consulta queda alojado en la variable de tipo ResultSet "resultado".

            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt("codigo"));
                fabricante.setNombre(resultado.getString("nombre"));
                fabricante.setNacionalidad(resultado.getString("nacionalidad"));
            }
            desconectarBase();

            return fabricante;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try {
            Fabricante fabricante = null;

            String sql = "SELECT * FROM fabricante WHERE nombre = '" + nombre + "';";
            consultarBase(sql);  //el resultado de la consulta queda alojado en la variable de tipo ResultSet "resultado".

            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt("codigo"));
                fabricante.setNombre(resultado.getString("nombre"));
                fabricante.setNacionalidad(resultado.getString("nacionalidad"));
            }
            desconectarBase();

            return fabricante;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            Fabricante fabricante = null;
            Collection<Fabricante> fabricantesArray = new ArrayList();

            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);

            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt("codigo"));
                fabricante.setNombre(resultado.getString("nombre"));
                fabricante.setNacionalidad(resultado.getString("nacionalidad"));
                fabricantesArray.add(fabricante);
            }
            desconectarBase();
            return fabricantesArray;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }

    }

}
