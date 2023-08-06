/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajpa.entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass  //le indica a JPA que esta clase no debe estar plasmada en la BBDD (es decir, que no cree una tabla "Persona"). Por su parte, los atributos sí son tenidos en cuenta para mapearlo en sus clases hijas (tablas Alumno y Profesor)
public abstract class Persona {

    @Id  //Primary key (llave primaria)
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Generación automática del valor de la primary key
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {  //los constructores con parámetros no deben tener en cuenta el id ya que se generan automáticamente en la BBDD
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getId() {  //evitamos incorporar el setter del id
        return id;
    }

}
