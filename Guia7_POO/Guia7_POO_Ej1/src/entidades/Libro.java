package entidades;

import java.util.Scanner;

public class Libro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //atributos privados
    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    //constructore
    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    //métodos getter y setter
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    //metodos propios
    public void cargarLibro(){
        System.out.print("Ingrese ISBN del libro: ");
        this.isbn = leer.nextInt();
        System.out.print("Ingrese título del libro: ");
        this.titulo = leer.next();
        System.out.print("Ingrese nombre del autor del libro: ");
        this.autor = leer.next();
        System.out.print("Ingrese la cantidad de páginas del libro: ");
        this.numPaginas = leer.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Cantidad de páginas: " + this.numPaginas);
    }
    
    
}
