
package utilidades;

public class CadenaUtilidad {
    
    public static int cuentaVocal(String frase){
        String vocales = "aeiou";
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if(vocales.indexOf(c) != -1){
                contador++;
            }
        }
        return contador;
    }
    
    public static String fraseInvertida(String frase){
        String fraseInversa = "";
        char c;
        for (int i = (frase.length()-1); i >= 0; i--) {
            c = frase.charAt(i);
            fraseInversa+=c;
        }
        return fraseInversa;
    }
    
    
    
    
    
    
    
}
