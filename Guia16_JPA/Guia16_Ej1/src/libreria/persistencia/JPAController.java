package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAController<T> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    protected JPAController() {
        emf = Persistence.createEntityManagerFactory("Guia16_Ej1PU");
        em = emf.createEntityManager();
    }

    protected void conectar() {
        if (em != null && em.isOpen()) { //Verifica si em no es null y además si em está abierto.
            em.close();
        }
        em = emf.createEntityManager();
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void crearEntidad(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new Exception("Error al crear el objeto", e);
        } finally {
            desconectar();
        }
    }

    protected void editarEntidad(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new Exception("Error al editar el objeto", e);
        } finally {
            desconectar();
        }
    }

    protected void borrarEntidad(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new Exception("Error al borrar el objeto", e);
        } finally {
            desconectar();
        }
    }

}
