
package servicios;

import entidades.Revolver;
import java.util.Random;

public class RevolverService {
    
    public Revolver crearRevolver(){    
        return new Revolver();
    }
    
    public void llenarRevolver(Revolver revolver){  //le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
        Random r = new Random();
        revolver.setPosicionAgua(r.nextInt(6) + 1);
        revolver.setPosicionActual(r.nextInt(6) + 1);
    }
    
    public boolean mojar(Revolver revolver){        //devuelve true si la posición del agua coincide con la posición actual.
        return revolver.getPosicionActual().equals(revolver.getPosicionAgua());
    }
    
    public void siguienteChorro(Revolver revolver){    //cambia a la siguiente posición del tambor.
        if(revolver.getPosicionActual() == 6){
            revolver.setPosicionActual(1);
        }else{
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        }
    }
    
    public void revisarRevolver(Revolver revolver){
        System.out.println(revolver);
    }
    
    
    
}
