/*
Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
 */
package entidades;

import enumeraciones.TipoGimnasio;

public class Hotel4 extends Hotel {

    protected TipoGimnasio gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(TipoGimnasio gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public TipoGimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(TipoGimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

    @Override
    public void calcularPrecioHabitacion() {
        Integer valor = 50 + (1 * numCamas) + valorRestaurante() + valorGimnasio();
        precioHabitacion = valor;
        System.out.println("El precio de la habitación del hotel de 4 estrellas es: " + valor);
    }

    protected Integer valorRestaurante() {
        Integer valor;
        if (capacidadRestaurante < 30) {
            valor = 10;
        } else if (capacidadRestaurante <= 50) {
            valor = 30;
        } else {
            valor = 50;
        }
        return valor;
    }

    protected Integer valorGimnasio() {
        Integer valor;
        if (gimnasio.A.toString().equalsIgnoreCase("A")) {
            valor = 50;
        } else {
            valor = 30;
        }
        return valor;
    }

}
