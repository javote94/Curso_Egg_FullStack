package libreria.persistencia;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroController extends JPAController<Libro> {

    public void crearLibro(Libro libro) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("Debe indicar un libro");
            }
            super.crearEntidad(libro);
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarLibro(Libro libro) throws Exception {
        if (libro == null) {
            throw new IllegalArgumentException("Debe indicar un libro");
        }
        super.editarEntidad(libro);
    }

    public void borrarLibro(Libro libro) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("Debe indicar un libro");
            }
            super.borrarEntidad(libro);
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarLibroPorIsbn(Long isbn) throws Exception{
        if(isbn == null){
            throw new IllegalArgumentException("Debe indicar el ISBN del libro");
        }
        super.conectar();
        try {
            return em.find(Libro.class, isbn);  //el método retornará null si no encuentra la entidad con el id dado. No lanza excepciones en ese caso.
        } finally {
            super.desconectar();
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        if (titulo == null) {
            throw new IllegalArgumentException("Debe indicar el título del libro");
        }
        super.conectar();
        try {
            List<Libro> libroList = em.createNamedQuery("Libro.findByTitle", Libro.class).setParameter("titulo", titulo).getResultList();
            if (libroList.isEmpty()) {
                return null;  // Retorna null si no se encontró el libro
            } else {
                return libroList.get(0);  // Retorna el primer libro si se encontró alguno
            }
        } finally {
            super.desconectar();
        }
    }

    public List<Libro> buscarLibrosPorAutor(Autor autor) {
        List<Libro> libros = new ArrayList();
        super.conectar();
        libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :autor").setParameter("autor", autor).getResultList();
        super.desconectar();
        return libros;
    }

    public List<Libro> buscarLibrosPorEditorial(Editorial editorial) {
        List<Libro> libros = new ArrayList();
        super.conectar();
        libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial = :editorial").setParameter("editorial", editorial).getResultList();
        super.desconectar();
        return libros;
    }

    public List<Libro> listarLibros() throws Exception {
        try {
            super.conectar();
            List<Libro> libros = em.createNamedQuery("Libro.findAll").getResultList();
            super.desconectar();
            return libros;
        } catch (Exception e) {
            throw e;
        }
    }

}
