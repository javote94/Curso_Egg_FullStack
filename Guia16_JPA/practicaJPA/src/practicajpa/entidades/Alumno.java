package practicajpa.entidades;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQuery(
    name = "Alumno.findAll",
    query = "SELECT a FROM Alumno a"
)

@Entity  //le indica a JPA que la clase es una entidad, por ende, debe ser incorporado como tabla en la BBDD
@Table(name = "alumnos")
public class Alumno extends Persona implements Serializable {

    @ManyToMany
    @JoinTable(name = "curso_alumno",    //Creación de tabla intermedia/asociativa que debe existir en una relación de ManyToMany (lo llamamos "curso_alumno")
            joinColumns = @JoinColumn(name = "curso_id"),  //indicamos que en la tabla asociativa incorpore la columna de curso_id ...
            inverseJoinColumns = @JoinColumn(name = "alumno_id"))  //... y en la otra columna que incorpore el alumno_id
    private Set<Curso> cursos;   //Relación ManyToMany: varios alumnos pueden estar en muchos cursos (el set evita objetos duplicados)

    public Alumno() {
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

}
