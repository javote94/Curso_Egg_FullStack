
package practicajpa.repositorios;

import java.util.List;
import practicajpa.entidades.Alumno;


public class AlumnoRepositorio extends RepositorioJPA<Alumno>{

    public AlumnoRepositorio() {
        super();
    }
    
    public void crear(Alumno alumno){
        super.create(alumno);
    }
    
    public void editar(Alumno alumno){
        super.update(alumno);
    }
    
    public void borrar(Long id){      //el método recibe el id del alumno como parámetro
        Alumno alumno = findId(id);   //el id lo usamos para identificar el objeto alumno que queremos borrar de la BBDD
        super.delete(alumno);
    }
    
    public Alumno findId(Long id){   //buscamos o rastreamos el objeto alumno mediante el id pasado como argumento
        super.conect();
        Alumno alumno = em.find(Alumno.class, id);
        super.disconect();
        return alumno;
    }
    
    public List<Alumno> listarAlumnos(){
        super.conect();
        List<Alumno> alumnos = em.createNamedQuery("Alumno.findAll",Alumno.class).getResultList();
        super.disconect();
        return alumnos;
    }
    
    public Long cantidadAlumnos(){
        super.conect();
        Long cantidad = (Long) em.createNativeQuery("SELECT COUNT(*) FROM alumnos").getSingleResult();  //las NativeQuery nos permite realizar consultas con código SQL y no JPQL
        super.disconect();
        return cantidad;
    }
    
}
