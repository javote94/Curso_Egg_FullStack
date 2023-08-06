/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
*/

package guia3;
import java.util.Scanner;

public class Ej6 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        String confirma;
        boolean log = true;
        
        do{
            System.out.println("Ingresar dos números enteros positivos:");
            num1 = leer.nextInt();
            num2 = leer.nextInt();

            System.out.print("MENU\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Salir\n" +
            "Elija opción:");

            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int producto = num1 * num2;
                    System.out.println("La multiplicación es: " + producto);
                    break;
                case 4:
                    double division = (double) num1 / num2;
                    System.out.println("La división es: " + division);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa?(S/N)");
                    confirma = leer.next();
                    
                    if(confirma.equalsIgnoreCase("S")){
                        log = false;
                        System.out.println("Saliendo del programa...");
                    }else if(confirma.equalsIgnoreCase("N")){
                        System.out.println("Volviendo...");;
                    }else {
                        System.out.println("Opción incorrecta");
                    }
            }
        }while(log == true);
                
        System.out.println("Ha salido del programa!!");
    }
}
