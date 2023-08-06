/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.

Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package guia4;

import java.util.Scanner;

public class EjTeoria1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar una cadena de texto que termine en punto:");
        String cadena = leer.nextLine();

        String cadenaNueva = codificar(cadena);
        System.out.println(cadenaNueva);
    }

    public static String codificar(String cadena) {
        String mensaje = "";

        int longitud = cadena.length();

        if (!cadena.substring(longitud - 1).equals(".")) {    //comprobamos que la cadena termine en punto. Usamos operador lógico de negación (!)
            mensaje = "Error. La cadena debe terminar con punto";
            return mensaje;
        }

        for (int i = 0; i < longitud; i++) {

            switch (cadena.substring(i, i + 1)) {
                case "a":
                    mensaje = mensaje.concat("@");
                    break;
                case "e":
                    mensaje = mensaje.concat("#");
                    break;
                case "i":
                    mensaje = mensaje.concat("$");
                    break;
                case "o":
                    mensaje = mensaje.concat("%");
                    break;
                case "u":
                    mensaje = mensaje.concat("*");
                    break;
                default:
                    mensaje = mensaje.concat(cadena.substring(i, i + 1));
            }
        }
        return mensaje;
    }

}
