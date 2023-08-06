
package servicios;

import java.util.Arrays;


public class ArregloService {
    
    public static void inicializarA(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random() * 10;
        }
    }
    
    public static void mostrarArreglo(double[] vector){
        for (double elemento : vector) {
            System.out.println("[" + elemento + "]");
        }
    }
    
    public static void ordenarArreglo(double[] vector){
        Arrays.sort(vector);
        
        int n = vector.length;
        double aux;
        for (int i = 0; i < n/2; i++) {
            aux = vector[(n-1)-i];             //En cada iteración, la variable auxiliar va almacenando los valores de las últimas posiciones del vector.
            vector[(n-1)-i] = vector[i];       //Los valores que están alojados en las primeras posiciones se almacenan en las últimas posiciones.
            vector[i] = aux;                   //A su vez, el valor auxiliar se aloja en las primeras posiciones del vector.
        }
    }
    
    public static void inicializarB(double[] arregloB, double[] arregloA){
        int n = arregloB.length;
        for (int i = 0; i < n; i++) {
            if(i < n/2){
                arregloB[i] = arregloA[i];
            }
        }
        Arrays.fill(arregloB, (n/2), n, 0.5);
    }
    
}
