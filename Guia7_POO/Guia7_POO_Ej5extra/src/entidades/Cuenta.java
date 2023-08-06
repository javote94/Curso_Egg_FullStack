/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package entidades;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);

    //atributos
    protected String titular;
    protected double saldo;
            
    //constructores
    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //métodos getter y setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //operaciones
    /**
     * La función extrae dinero de la cuenta bancaria del titular y va a parar al bolsillo del destinatario que se pase por parámetro
     * @param destinatario 
     */
    public void retiroDinero(Bolsillo destinatario) {
        System.out.println("Hola " + this.titular + ", ingrese cantidad de efectivo a retirar de la cuenta.");
        System.out.println("Su saldo actual es de " + this.saldo);
        double extraccion = leer.nextDouble();
        if (extraccion <= this.saldo) {
            this.saldo -= extraccion;                                    //extracción de dinero de la cuenta
            System.out.println("Su saldo final es de: " + this.saldo);   //saldo resultante
            System.out.println("El dinero extraído es destinado al bolsillo de " + destinatario.titular);
            destinatario.efectivo += extraccion;                         //aumento de la cantidad de efectivo en el bolsillo del destinarario
        } else {
            System.out.println("El retiro excede su saldo actual. Se rechaza la solicitud.");
        }
    }
    
    
    
    //toString
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
}
