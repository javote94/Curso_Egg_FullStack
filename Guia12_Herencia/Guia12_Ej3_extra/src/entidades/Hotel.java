/*Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.*/
package entidades;

public abstract class Hotel extends Alojamiento {

    protected Integer cantidadHabitaciones;
    protected Integer numCamas;
    protected Integer cantidadPisos;
    protected Integer precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cantidadHabitaciones, Integer numCamas, Integer cantidadPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numCamas = numCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numCamas=" + numCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

    public abstract void calcularPrecioHabitacion();

}
