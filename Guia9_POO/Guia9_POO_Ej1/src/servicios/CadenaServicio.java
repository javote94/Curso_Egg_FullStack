
package servicios;

import java.util.Scanner;
import entidades.Cadena;
import utilidades.CadenaUtilidad;

public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        System.out.print("Ingresar frase: ");
        return new Cadena(leer.next());
    }
    
    public void mostrarVocales(Cadena objeto){
        String frase = objeto.getFrase().toLowerCase();
        int cantidadVocales = CadenaUtilidad.cuentaVocal(frase);
        System.out.println("La cantidad de vocales que tiene la frase es: " + cantidadVocales); 
    }
    
    public void invertirFrase(Cadena objeto){
        String frase = objeto.getFrase();
        String fraseInversa = CadenaUtilidad.fraseInvertida(frase);
        System.out.println("La frase invertida es: " + fraseInversa);
    }
    
    public void vecesRepetido(Cadena objeto, char caracter){
        String frase = objeto.getFrase();
        int contador = 0;
        for (char elemento : frase.toCharArray()) {
            if(elemento == caracter){
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " se repite " + contador + " veces");
    }
    
    public void compararLongitud(Cadena objeto, String fraseNueva){
        String frase = objeto.getFrase();
        
        if(fraseNueva.length() > frase.length()){
            System.out.println("La longitud de la frase ingresada es mayor que la cadena");
        }else if(fraseNueva.length() == frase.length()){
            System.out.println("La longitud de ambas frases son iguales");
        }else{
            System.out.println("La longitud de la frase ingresada es menor que la cadena");
        }
    }
    
    public void unirFrases(Cadena objeto, String fraseNueva){
        String frase = objeto.getFrase();
        System.out.println(frase.concat(fraseNueva));
    }
    
    public void reemplazar(Cadena objeto, char caracter){
        String frase = objeto.getFrase();
        System.out.println("Nueva frase: " + frase.replace('a', caracter));
    }
    
    public void contiene(Cadena objeto, String caracter){
        String frase = objeto.getFrase();
        System.out.println("La letra está en la cadena?: " + frase.contains(caracter));
    }
    
}
