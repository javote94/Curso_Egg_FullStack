package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;

public final class LavadoraService extends ElectrodomesticoService {
    
    private static int num = 0;
    
    public Lavadora crearLavadora() {
        
        num++;
        System.out.println("---CREACIÓN DE LAVADORA N°" + num + "---");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.print("Ingresar la carga de la lavadora (mín 1 kg): ");
        Integer carga = leer.nextInt();
        Lavadora lavadora = new Lavadora(carga, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());

        return lavadora;
    }

    

}
