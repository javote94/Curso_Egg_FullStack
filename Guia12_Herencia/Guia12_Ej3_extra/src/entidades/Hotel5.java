/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package entidades;

import enumeraciones.TipoGimnasio;

public final class Hotel5 extends Hotel4 {

    private Integer cantidadSalonesConf;
    private Integer cantidadSuites;
    private Integer cantidadLimusinas;

    public Hotel5() {
    }

    public Hotel5(Integer cantidadSalonesConf, Integer cantidadSuites, Integer cantidadLimusinas, TipoGimnasio gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConf = cantidadSalonesConf;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimusinas = cantidadLimusinas;
    }

    public Integer getCantidadSalonesConf() {
        return cantidadSalonesConf;
    }

    public void setCantidadSalonesConf(Integer cantidadSalonesConf) {
        this.cantidadSalonesConf = cantidadSalonesConf;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimusinas() {
        return cantidadLimusinas;
    }

    public void setCantidadLimusinas(Integer cantidadLimusinas) {
        this.cantidadLimusinas = cantidadLimusinas;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel5{" + "cantidadSalonesConf=" + cantidadSalonesConf + ", cantidadSuites=" + cantidadSuites + ", cantidadLimusinas=" + cantidadLimusinas + '}';
    }
    
    @Override
    public void calcularPrecioHabitacion(){
        Integer valor = 50 + (1 * numCamas) + valorRestaurante() + valorGimnasio() + valorLimusina();
        precioHabitacion = valor;
        System.out.println("El precio de la habitación del hotel de 5 estrellas es: " + valor);
    }
    
    private Integer valorLimusina(){
        return cantidadLimusinas * 15;
    }
    
    
    
    

}
