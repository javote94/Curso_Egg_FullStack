
package entidades;


public class ParDeNumeros {
    
    //Atributos
    double num1;
    double num2;
    
    //Constructor vacío
    public ParDeNumeros() {
        num1 = Math.random() * 10;
        num2 = Math.random() * 10;
    }
    
    //Getters y Setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
    
}
