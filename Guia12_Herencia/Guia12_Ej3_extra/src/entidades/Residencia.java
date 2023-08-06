package entidades;

public final class Residencia extends AlojamientoExtraHotelero {

    private Integer cantidadHabitaciones;
    private boolean descuentoGremial;
    private boolean campoDeportivo;

    public Residencia() {
    }
    
    public Residencia(Integer cantidadHabitaciones, boolean descuentoGremial, boolean campoDeportivo, boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremial = descuentoGremial;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremial() {
        return descuentoGremial;
    }

    public void setDescuentoGremial(boolean descuentoGremial) {
        this.descuentoGremial = descuentoGremial;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", descuentoGremial=" + descuentoGremial + ", campoDeportivo=" + campoDeportivo + '}';
    }

}
