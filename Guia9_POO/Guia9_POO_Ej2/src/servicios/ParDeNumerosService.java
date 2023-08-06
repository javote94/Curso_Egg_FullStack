
package servicios;

import entidades.ParDeNumeros;


public class ParDeNumerosService {
    
    public static void mostrarValores(ParDeNumeros x){
        System.out.println(x);
    }
    
    public static double devolverMayor(ParDeNumeros x){
        return Math.max(x.getNum1(), x.getNum2());
    }
    
    public static void calcularPotencia(ParDeNumeros x){
        double numMayorRedond = Math.round(devolverMayor(x));
        double numMinRedond = Math.round(Math.min(x.getNum1(), x.getNum2()));
        double resultado = Math.pow(numMayorRedond, numMinRedond);
        System.out.println("El resultado de " + numMayorRedond + " elevado a " + numMinRedond + " es igual a " + resultado);
    }
    
    public static void calcularRaiz(ParDeNumeros x){
        double numMinAbs = Math.abs(Math.min(x.getNum1(), x.getNum2()));
        double resultado = Math.sqrt(numMinAbs);
        System.out.println("La raiz cuadrada de " + numMinAbs + " es de " + resultado);
    }
}
