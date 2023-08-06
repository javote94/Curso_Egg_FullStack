package entidades;

public final class Televisor extends Electrodomestico {

    //Atributos
    private Integer resolucion;
    private Boolean sintonizadorTDT;

    //Constructores
    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, Character consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Getters & Setters
    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }

    @Override
    public Double precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio *= (1 + 0.30);
        }
        if (sintonizadorTDT) {
            precio += 500;
        }
        
        return precio;
    }

}
