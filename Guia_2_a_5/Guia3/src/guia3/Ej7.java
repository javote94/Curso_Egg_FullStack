/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
*/

package guia3;
import java.util.Scanner;

public class Ej7 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        
        do{
            System.out.print("Ingresar una cadena de caracteres: ");
            String cadena = leer.nextLine();

            int longitud = cadena.length();
            String primerChar = cadena.substring(0,1);
            String ultimoChar = cadena.substring(longitud-1, longitud);

            if(longitud <= 5 && primerChar.equalsIgnoreCase("X") && ultimoChar.equalsIgnoreCase("O")){
                correcto += 1;
            }else if(cadena.equals("&&&&&")){
                break;     
            }else{
                incorrecto += 1;
            }
        }while(true);
        
        System.out.println("Lecturas correctas: " + correcto);
        System.out.println("Lecturas incorrectas: " + incorrecto);
    }
}
