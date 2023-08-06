package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

public class EditorialController extends JPAController<Editorial> {

    public void crearEditorial(Editorial editorial) throws Exception {
        try {
            if (editorial == null) {
                throw new Exception("Debe indicar una editorial");
            }
            super.crearEntidad(editorial);
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarEditorial(Editorial editorial) throws Exception {
        try {
            if (editorial == null) {
                throw new Exception("Debe indicar una editorial");
            }
            super.editarEntidad(editorial);
        } catch (Exception e) {
            throw e;
        }
    }

    public void borrarEditorial(Editorial editorial) throws Exception {
        try {
            if (editorial == null) {
                throw new Exception("Debe indicar una editorial");
            }
            super.borrarEntidad(editorial);
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial buscarEditorialPorNombre(String nombreEditorial) throws Exception {
        if (nombreEditorial == null) {
                throw new IllegalArgumentException("Debe indicar el nombre de la editorial");
            }
        super.conectar();
        try {
            List<Editorial> editorialList = em.createNamedQuery("Editorial.findByName", Editorial.class).setParameter("nombre", nombreEditorial).getResultList();
            if (editorialList.isEmpty()) {
                return null;  // Retorna null si no se encontró la editorial
            } else {
                return editorialList.get(0);  // Retorna la primer editorial si se encontró alguna
            }
        } finally {
            super.desconectar();
        }
    }
    
    public Editorial buscarEditorialPorId(Integer id) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Debe indicar el id del autor");
        }
        super.conectar();
        try {
            Editorial editorial = em.find(Editorial.class, id);
            return editorial;
        } finally {
            super.desconectar();
        }
    }
    

}
