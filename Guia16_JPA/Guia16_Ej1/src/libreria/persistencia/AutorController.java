package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorController extends JPAController<Autor> {

    public void crearAutor(Autor autor) throws Exception {
        try {
            if (autor == null) {
                throw new Exception("Debe indicar un autor");
            }
            super.crearEntidad(autor);
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarAutor(Autor autor) throws Exception {
        try {
            if (autor == null) {
                throw new Exception("Debe indicar un autor");
            }
            super.editarEntidad(autor);
        } catch (Exception e) {
            throw e;
        }
    }

    public void borrarAutor(Autor autor) throws Exception {
        try {
            if (autor == null) {
                throw new Exception("Debe indicar un autor");
            }
            super.borrarEntidad(autor);
        } catch (Exception e) {
            throw e;
        }
    }

    public Autor buscarAutorPorNombre(String nombreAutor) throws Exception {
        if (nombreAutor == null) {
            throw new IllegalArgumentException("Debe indicar el nombre del autor");
        }
        super.conectar();
        try {
            List<Autor> autorList = em.createNamedQuery("Autor.findByName", Autor.class).setParameter("nombre", nombreAutor).getResultList();
            if (autorList.isEmpty()) {
                return null;  // Retorna null si no se encontró el autor
            } else {
                return autorList.get(0);  // Retorna el primer autor si se encontró alguno
            }
        } finally {
            super.desconectar();
        }
    }
    
    public Autor buscarAutorPorId(Integer id) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Debe indicar el id del autor");
        }
        super.conectar();
        try {
            Autor autor = em.find(Autor.class, id);
            return autor;
        } finally {
            super.desconectar();
        }
    }

}


























