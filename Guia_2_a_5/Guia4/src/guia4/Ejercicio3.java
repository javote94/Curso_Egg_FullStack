/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).

El cambio de divisas es:
0.86 libras es un 1 €
1.28611 dolares es un 1 €
129.852 yenes es un 1 €
*/

package guia4;
import java.util.Scanner;

public class Ejercicio3 {
    
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        
        System.out.print("Ingresar cantidad de euros: ");
        double euro = leer.nextDouble();
        
        System.out.println("Ingresar divisa para la conversión:\n"
                + "Dolar\n"
                + "Libra\n"
                + "Yen");
        String moneda = leer.next();
        
        conversion(euro, moneda);
    }
    
    public static void conversion(double euro, String moneda){
        
        switch(moneda){
            case "dolar":
                double dolar = euro * 1.28611;
                System.out.println(euro+" euros son "+dolar+" dólares");
                break;
            case "libra":
                double libra = euro * 0.86;
                System.out.println(euro+" euros son "+libra+" libras");
                break;
            case "yen":
                double yen = euro * 129.852;
                System.out.println(euro+" euros son "+yen+" yenes");
                break;
            default:
                System.out.println("Moneda incorrecta");
        }
        
    }
}
