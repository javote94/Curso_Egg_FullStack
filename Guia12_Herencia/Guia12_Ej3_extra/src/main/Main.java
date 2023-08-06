package main;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4;
import entidades.Hotel5;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.List;
import enumeraciones.TipoGimnasio;

public class Main {

    public static void main(String[] args) {

        List<Alojamiento> alojamientos = new ArrayList();

        Hotel5 h5 = new Hotel5(3, 5, 10, TipoGimnasio.A, "La Parolaccia", 50, 10, 20, 5, 0, "Las Margaritas", "Pasco 555", "Miameee", "Ricardo Fort");
        Hotel4 h4 = new Hotel4(TipoGimnasio.B, "Lo de Abelardo", 25, 50, 100, 14, 0, "Las estrellas", "Segurola y Habana", "Mar Chiquita", "Osvaldo Laport");
        Camping camping = new Camping(10, 2, true, true, 5000, "Las alpacas", "Posta de Yatasto", "Humauaca", "Soledad Silveira");
        Residencia residencia = new Residencia(20, true, false, true, 1000, "Magolla", "Ni idea", "Que se yo", "Marley, Mirko y Malenka");
        
        h5.calcularPrecioHabitacion();
        h4.calcularPrecioHabitacion();
        
        alojamientos.add(h4);
        alojamientos.add(h5);
        alojamientos.add(camping);
        alojamientos.add(residencia);
        
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
        
    }

}
