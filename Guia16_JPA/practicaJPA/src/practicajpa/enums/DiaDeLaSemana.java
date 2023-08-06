/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajpa.enums;

/**
 *
 * @author Javo
 */
public enum DiaDeLaSemana {

    LUNES(2),
    MARTES(3),
    MIERCOLES(4),
    JUEVES(5),
    VIERNES(6),
    SABADO(7),
    DOMINGO(1);

    final int numero;

    private DiaDeLaSemana(int num) {
        this.numero = num;
    }

}
