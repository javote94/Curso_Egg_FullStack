
package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO{
    
    public void guardarFabricante(Fabricante fabricante) throws Exception{
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre, nacionalidad) "
                    + "VALUES('" + fabricante.getNombre() + "', '" + fabricante.getNacionalidad() + "');";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    
}
