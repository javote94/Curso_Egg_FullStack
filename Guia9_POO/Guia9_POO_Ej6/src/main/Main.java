
package main;

import entidades.Curso;
import servicios.CursoService;

public class Main {

    public static void main(String[] args) {
        
        CursoService cs = new CursoService();
        Curso curso1 = cs.crearCurso();
        System.out.println(curso1);
        
        double ganancia = cs.calcularGananciaSemanal(curso1);
        System.out.println("La ganancia semanal que obtienes por el curso " + curso1.getNombreCurso() + " es de $" + ganancia);
        
        
    }
    
}
