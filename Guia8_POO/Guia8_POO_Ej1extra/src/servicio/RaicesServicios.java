package servicio;

import entidad.Raices;

public class RaicesServicios {

    public double getDiscriminante(Raices ecuacion) {
        return Math.pow(ecuacion.getB(), 2) - 4 * ecuacion.getA() * ecuacion.getC();
    }

    public boolean tieneRaices(Raices ecuacion) {
        return getDiscriminante(ecuacion) >= 0;
    }

    public boolean tieneRaiz(Raices ecuacion) {
        return getDiscriminante(ecuacion) == 0;
    }

    public void obtenerRaices(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            double r1 = ((-ecuacion.getB()) + Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            double r2 = ((-ecuacion.getB()) - Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            System.out.println(".:DOS RAICES O SOLUCIONES DIFERENTES (REALES):.");
            System.out.println("1° Raíz: " + r1);
            System.out.println("2° Raíz: " + r2);
        } else {
            System.out.println("No tiene solucion real");
        }
    }

    public void obtenerRaiz(Raices ecuacion) {
        if (tieneRaiz(ecuacion)) {
            double r1 = ((-ecuacion.getB()) + Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            double r2 = ((-ecuacion.getB()) - Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            System.out.println(".:DOS RAICES O SOLUCIONES IGUALES (REALES):.");
            System.out.println("1° Raíz: " + r1);
            System.out.println("2° Raíz: " + r2);
        } else {
            System.out.println("Tiene más de una solución posible o no tiene solución real");
        }
    }

}
