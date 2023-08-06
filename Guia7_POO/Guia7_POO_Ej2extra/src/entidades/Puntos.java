/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
*/
package entidades;

import java.util.Scanner;

public class Puntos {
    
    Scanner leer = new Scanner(System.in);
    
    //atributos
    private int x;
    private int y;
    
    //constructores
    public Puntos(){
    }
    
    public Puntos(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //metodos get y setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //operaciones
    public void crearPunto(){
        System.out.print("Ingresar coordenada x: ");
        this.x = leer.nextInt();
        System.out.print("Ingresar coordenada y: ");
        this.y = leer.nextInt();
    }
    
    /**
     * La función retorna la distancia del objeto con respecto al punto pasado por parámetro 
     * @param punto
     * @return Valor de tipo double
     */
    public double distancia(Puntos punto){
        return Math.sqrt(Math.pow((punto.x - this.x),2) + Math.pow((punto.y - this.y),2));
    }

    @Override
    public String toString() {
        return "Puntos{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
