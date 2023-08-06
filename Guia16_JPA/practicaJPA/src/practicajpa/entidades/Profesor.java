/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajpa.entidades;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(
    name = "Profesor.findById",
    query = "SELECT p FROM Profesor p WHERE p.id = :id"
    ),
    @NamedQuery(
    name = "Profesor.findAll",
    query = "SELECT p FROM Profesor p"
    )
})

@Entity  //le indica a JPA que la clase es una entidad, por ende, debe ser incorporado como tabla en la BBDD
@Table(name = "profesores")
public class Profesor extends Persona implements Serializable {  //los atributos id, nombre y apellido que hereda ya fueron mapeados en la super clase Persona

    @OneToMany(mappedBy = "profesor")  //el argumento (mappedBy = "profesor") indica que la presente clase (Profesor) está conectada a la clase Curso a través del atributo "profesor"
    private Set<Curso> cursos;   //Relación OneToMany: un profesor puede dictar varios cursos (el set evita objetos duplicados)

    public Profesor() {
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

}
