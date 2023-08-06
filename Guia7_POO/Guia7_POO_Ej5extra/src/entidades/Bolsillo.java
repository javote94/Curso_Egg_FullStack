
package entidades;


public class Bolsillo {
    
    //atributos
    protected String titular;
    protected double efectivo;
    
    //constructores
    public Bolsillo() {
    }

    public Bolsillo(String titular, double efectivo) {
        this.titular = titular;
        this.efectivo = efectivo;
    }
    
    //metodos getter y setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }
    
    //operaciones
    
    
    //toString
    @Override
    public String toString() {
        return "Bolsillo{" + "titular=" + titular + ", efectivo=" + efectivo + '}';
    }
    
    
}
