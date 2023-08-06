package entidades;

public final class Camping extends AlojamientoExtraHotelero {

    private Integer cantidadCarpas;
    private Integer cantidadBanos;
    private boolean Restaurante;

    public Camping(Integer cantidadCarpas, Integer cantidadBanos, boolean Restaurante, boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadCarpas = cantidadCarpas;
        this.cantidadBanos = cantidadBanos;
        this.Restaurante = Restaurante;
    }

    public Integer getCantidadCarpas() {
        return cantidadCarpas;
    }

    public void setCantidadCarpas(Integer cantidadCarpas) {
        this.cantidadCarpas = cantidadCarpas;
    }

    public Integer getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(Integer cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(boolean Restaurante) {
        this.Restaurante = Restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantidadCarpas=" + cantidadCarpas + ", cantidadBanos=" + cantidadBanos + ", Restaurante=" + Restaurante + '}';
    }

}
