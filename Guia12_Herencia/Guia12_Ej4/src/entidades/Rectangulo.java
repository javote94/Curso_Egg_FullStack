package entidades;

public final class Rectangulo extends FormaGeometrica {

    //Atributos
    private double base;
    private double altura;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getters & Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double calculoArea() {
        return base * altura;
    }

    @Override
    public double calculoPerimetro() {
        return ((base + altura) * 2);
    }

}
