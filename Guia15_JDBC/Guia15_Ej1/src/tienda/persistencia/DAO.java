
package tienda.persistencia;

import java.sql.*;

public abstract class DAO {
    
    protected Connection conexion = null;
    protected Statement sentencia = null;
    protected ResultSet resultado = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://localhost:3306/" + DATABASE + "?zeroDateTimeBehavior=convertToNull";
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    
     protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
     
    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            //conexion.rollback();
            /*
            Descomentar la línea anterior si se desea tener en cuenta el rollback.
            Adicionalmente, ejecutar el siguiente script en Workbench:
            SET autocommit=1;
            COMMIT;
             */
            throw ex;
        } finally {
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws ClassNotFoundException, Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }

    }
    
}
