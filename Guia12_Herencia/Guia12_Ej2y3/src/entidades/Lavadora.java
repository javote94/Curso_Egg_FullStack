package entidades;

public final class Lavadora extends Electrodomestico {

    //Atributos
    private Integer carga;

    //Constructores
    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, Character consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //Getters & Setters
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + "Lavadora{" + "carga=" + carga + '}';
    }

    @Override
    public Double precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }
        return precio;
    }

}
