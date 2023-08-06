package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;

public final class TelevisorService extends ElectrodomesticoService {
    
    private static int num = 0;
    
    public Televisor crearTelevisor() {
        
        num++;
        System.out.println("---CREACIÓN DE TELEVISOR N°" + num + "---");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.print("Ingresar resolución del televisor (cantidad de pulgadas): ");
        Integer resolucion = leer.nextInt();
        System.out.print("Tiene sintonizador? (TRUE/FALSE): ");
        Boolean sintonizador = leer.nextBoolean();
        Televisor televisor = new Televisor(resolucion, sintonizador, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        
        return televisor;
    }

}
