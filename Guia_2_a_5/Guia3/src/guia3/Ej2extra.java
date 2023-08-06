/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.

b <- c
c <- a
a <- d
d <- b

*/
package guia3;

public class Ej2extra {
    
    public static void main(String[] args) {
        
        int a = 1, b = 5, c = 10, d = 20, aux;
        
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        System.out.println("d: "+ d);
        System.out.println("--------");
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        System.out.println("d: "+ d);
        
        
    }
}
