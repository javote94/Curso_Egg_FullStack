package entidad;

import java.util.Arrays;

public class Ahorcado {

    //Atributos
    private char[] palabraSecreta;
    private int LetrasEncontradas;
    private int jugadasMaximo;

    //Constructor vacío
    public Ahorcado() {
    }

    //Constructor con parámetros
    public Ahorcado(char[] palabraSecreta, int jugadasMaximo) {
        this.palabraSecreta = palabraSecreta;
        this.jugadasMaximo = jugadasMaximo;
    }

    //Getters & Setters
    public char[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(char[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getLetrasEncontradas() {
        return LetrasEncontradas;
    }

    public void setLetrasEncontradas(int LetrasEncontradas) {
        this.LetrasEncontradas = LetrasEncontradas;
    }

    public int getJugadasMaximo() {
        return jugadasMaximo;
    }

    public void setJugadasMaximo(int jugadasMaximo) {
        this.jugadasMaximo = jugadasMaximo;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraSecreta=" + Arrays.toString(palabraSecreta) + ", LetrasEncontradas=" + LetrasEncontradas + ", jugadasMaximo=" + jugadasMaximo + '}';
    }

}
