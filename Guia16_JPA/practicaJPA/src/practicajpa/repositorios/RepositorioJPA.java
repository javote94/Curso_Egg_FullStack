package practicajpa.repositorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositorioJPA<T> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public RepositorioJPA() { //con el constructor inicializamos los dos atributos.
        emf = Persistence.createEntityManagerFactory("practicaJPAPU");
        em = emf.createEntityManager();  //creación del entity manager
    }

    //Cada vez que intentamos hacer una consulta con la BBDD, debemos conectarnos y desconectarnos.
    protected void conect() {  //abre conexión con la BBDD
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void disconect() {  //cierra conexión con la BBDD
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void create(T object) {    //el método recibe un objeto genérico como parámetro
        conect();
        em.getTransaction().begin();    //el objeto entity manager inicia transacción
        em.persist(object);             //guarda/persiste el objeto genérico en la BBDD
        em.getTransaction().commit();   //cierra transacción
        disconect();
    }

    protected void update(T object) {
        conect();
        em.getTransaction().begin();
        em.merge(object);               //actualiza el objeto en la BBDD
        em.getTransaction().commit();
        disconect();
    }

    protected void delete(T object) {
        conect();
        em.getTransaction().begin();
        em.remove(object);              //borra un objeto de la BBDD
        em.getTransaction().commit();
        disconect();
    }

}
