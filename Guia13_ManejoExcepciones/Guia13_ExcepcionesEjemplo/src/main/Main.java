
package main;


public class Main {

    
    public static void main(String[] args) {
        
        //Excepciones: problemas que pueden interrumpir el flujo normal del programa
        //Existen dos grandes grupos de excepciones:
        //1) Las que se pueden controlar
        //2) Las que no se pueden controlar
        
        //En el caso de las excepciones que se pueden controlar, los programadores pueden capturarlas
        //y darle tratamiento a ese error para darle continuidad al flujo del programa.
        
        //El objetivo es encerrar código que posiblemente pueda lanzar una excepción en un bloque TRY-CATCH
        
        
        int valor = Integer.valueOf("a");
        
        //El bloque TRY alojará el código o instrucción principal del programa, el cual potencialmente pueda lanzar una excepción.
        //La sentencia CATCH atrapa la excepción y luego ejecuta la decisión que habíamos tomado para hacer con ella.
        //Puede declararse varias sentencias CATCH pero únicamente podrá ejecutarse una.
        //El bloque FINALLY se ejecuta siempre, independientemente que se lance una excepción o no.
        
        
        //Por otro lado, como programadores podemos crear nuestras propias excepciones para lanzarlas cuando sea necesario.
        //Las excepciones que creamos extienden de la clase Exception, sea una excepción creada por nosotros o no.
        //Con la cláusula THROW + operador new + Constructor de la clase Java Exception: creamos un objeto de tipo Excepción
        //con un mensaje incorporado para advertir de la excepción.
        
        
        
        
    }
    
}
