package practicajpa.repositorios;

import java.util.List;
import practicajpa.entidades.Curso;
import practicajpa.enums.DiaDeLaSemana;

public class CursoRepositorio extends RepositorioJPA<Curso> {

    public CursoRepositorio() {
        super();
    }

    public void crear(Curso curso) {
        super.create(curso);
    }

    public void editar(Curso curso) {
        super.update(curso);
    }

    public void borrar(Long id) {
        Curso curso = em.find(Curso.class, id);
        super.delete(curso);
    }

    public Curso findId(Long id) {
        super.conect();
        Curso curso = em.createNamedQuery("Curso.findById", Curso.class).setParameter("id", id).getSingleResult();
        super.disconect();
        return curso;
    }

    public List<Curso> listarCursos() {
        super.conect();
        List<Curso> cursos = em.createNamedQuery("Curso.findAll").getResultList();
        super.disconect();
        return cursos;
    }
    
    public Curso buscarPorNombre(String nombre){
        super.conect();
        Curso curso = em.createQuery("SELECT c FROM Curso c WHERE c.nombre = :nombre", Curso.class).
                setParameter("nombre", nombre).getSingleResult();
        super.disconect();
        return curso;
    }
    
    public List<Curso> listarCursosPorDia(DiaDeLaSemana dia){
        super.conect();
        List<Curso> cursos = em.createQuery("SELECT c FROM Curso c WHERE c.dia = :dia", Curso.class).
                setParameter("dia", dia.toString()).getResultList();
        super.disconect();
        return cursos;
    }

}
