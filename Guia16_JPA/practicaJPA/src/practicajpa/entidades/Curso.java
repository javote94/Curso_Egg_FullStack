package practicajpa.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import practicajpa.enums.DiaDeLaSemana;


@NamedQueries({
    @NamedQuery(
        name = "Curso.findById",
        query = "SELECT c FROM Curso c WHERE c.id = :id"
    ),
    @NamedQuery(
            name = "Curso.findAll",
            query = "SELECT c FROM Curso c"
    )
})


@Entity  //le indica a JPA que la clase es una entidad, por ende, debe ser incorporado como tabla en la BBDD
@Table(name = "cursos")
public class Curso implements Serializable {

    @Id  //Primary key (llave primaria)
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Generación automática del valor de la primary key
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Enumerated(EnumType.STRING)  //le indica a JPA que este atributo es de tipo enum string
    private DiaDeLaSemana dia;

    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIME)  //le indica a JPA que este atributo es de tipo Date (el argumento TIME indica que nos quedamos con la hora)
    private Date horaInicio;

    @Column(name = "hora_fin")
    @Temporal(TemporalType.TIME)
    private Date horaFin;

    @Column(name = "cupo_maximo")
    private Integer cupo;

    @ManyToOne
    @JoinColumn(name = "profesor_id")  //nombre de la columna por la cual vamos a relacionar la tabla "cursos" con la de "profesores"
    private Profesor profesor;  //Relación ManyToOne: varios cursos pueden ser dictados por el mismo profesor

    @ManyToMany
    @JoinTable(name = "curso_alumno",  //Creación de tabla intermedia/asociativa que debe existir en una relación de ManyToMany (lo llamamos "curso_alumno")
            joinColumns = @JoinColumn(name = "curso_id"),  //indicamos que en la tabla asociativa incorpore la columna de curso_id ...
            inverseJoinColumns = @JoinColumn(name = "alumno_id"))  //... y en la otra columna que incorpore el alumno_id
    private Set<Alumno> alumnos; //Relación ManyToMany: varios cursos pueden tener muchos alumnos (el set evita objetos duplicados)

    public Curso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DiaDeLaSemana getDia() {
        return dia;
    }

    public void setDia(DiaDeLaSemana dia) {
        this.dia = dia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getCupo() {
        return cupo;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Long getId() {
        return id;
    }

}
