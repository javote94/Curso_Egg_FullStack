package practicajpa.repositorios;

import java.util.List;
import practicajpa.entidades.Profesor;

public class ProfesorRepositorio extends RepositorioJPA<Profesor> {

    public ProfesorRepositorio() {
        super();
    }

    public void crear(Profesor profesor) {
        super.create(profesor);
    }

    public void editar(Profesor profesor) {
        super.update(profesor);
    }

    public void borrar(Long id) {
        Profesor profesor = em.find(Profesor.class, id);
        super.delete(profesor);
    }

    public Profesor findId(Long id) {
        super.conect();
        Profesor profesor = em.createNamedQuery("Profesor.findById", Profesor.class).setParameter("id", id).getSingleResult();
        super.disconect();
        return profesor;
    }

    public List<Profesor> listarProfesores() {
        super.conect();
        List<Profesor> profesores = em.createNamedQuery("Profesor.findAll").getResultList();
        super.disconect();
        return profesores;
    }

    public List<Profesor> buscarPorNombre(String nombre) {  //el método retorna una lista ya que existe la posibilidad de que haya registros con el mismo nombre
        super.conect();
        List<Profesor> profesor = em.createQuery("SELECT p FROM Profesor p WHERE p.nombre = :nombre", Profesor.class).
                setParameter("nombre", nombre).getResultList();
        super.disconect();
        return profesor;
    }

}
