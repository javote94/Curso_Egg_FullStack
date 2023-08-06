package entidades;

public final class Circulo extends FormaGeometrica {

    //Atributos
    private double radio;
    private double diametro;

    //Constructores
    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    //Getters & Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public double calculoArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calculoPerimetro() {
        return PI * diametro;
    }

}
