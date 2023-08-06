/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
*/
package guia3;
import java.util.Scanner;

public class Ej5extra {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        char socio;
        float importe = 0, costo, descuento = 0;
        
        System.out.print("Ingresar la clase de socio (A/B/C): ");
        socio = leer.nextLine().toLowerCase().charAt(0);
        
        System.out.print("Ingresar costo total del tratamiento: ");
        costo = leer.nextFloat();
        
        switch(socio){
            case 'a':
                descuento = costo * 0.50f;
                importe = costo - descuento;
                break;
            case 'b':
                descuento = costo * 0.35f;
                importe = costo - descuento;
                break;
            case 'c':
                importe = costo;
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        
        if(socio == 'a' || socio == 'b' || socio == 'c'){
        System.out.println("Se aplica descuento de "+descuento+" , el importe"
            + " en efectivo a pagar es: "+importe);
        }
    }
}
