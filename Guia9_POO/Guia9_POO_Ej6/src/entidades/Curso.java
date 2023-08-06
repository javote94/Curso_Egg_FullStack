package entidades;

import java.util.Arrays;

public class Curso {

    //Atributos
    private String nombreCurso;
    private String[] alumnos;
    private int horasxDia;
    private int diasxSemana;
    private double precioxHora;
    private String turno;

    //Constructor vacío
    public Curso() {
    }

    //Constructor con parámetros
    public Curso(String nombreCurso, String[] alumnos, int horasxDia, int diasxSemana, double precioxHora, String turno) {
        this.nombreCurso = nombreCurso;
        this.alumnos = alumnos;
        this.horasxDia = horasxDia;
        this.diasxSemana = diasxSemana;
        this.precioxHora = precioxHora;
        this.turno = turno;
    }

    //Getters y Setters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getHorasxDia() {
        return horasxDia;
    }

    public void setHorasxDia(int horasxDia) {
        this.horasxDia = horasxDia;
    }

    public int getDiasxSemana() {
        return diasxSemana;
    }

    public void setDiasxSemana(int diasxSemana) {
        this.diasxSemana = diasxSemana;
    }

    public double getPrecioxHora() {
        return precioxHora;
    }

    public void setPrecioxHora(double precioxHora) {
        this.precioxHora = precioxHora;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", alumnos=" + Arrays.toString(alumnos) + ", horasxDia=" + horasxDia + ", diasxSemana=" + diasxSemana + ", precioxHora=" + precioxHora + ", turno=" + turno + '}';
    }
}
