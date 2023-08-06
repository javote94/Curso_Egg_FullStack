/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package entidades;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar base: ");
        this.base = leer.nextDouble();
        System.out.print("Ingresar altura: ");
        this.altura = leer.nextDouble();
    }

    public double superficie() {
        return this.base * this.altura;
    }

    public double perimetro() {
        return (this.base + this.altura) * 2;
    }

    public void mostrarRectangulo() {

        for (int i = 1; i <= this.altura; i++) {
            for (int j = 1; j <= this.base; j++) {
                if (i == 1 || j == 1 || i == this.altura || j == this.base) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
