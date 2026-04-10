package Colecciones.Listas.Clonaciones.Ejercicio1.Models;

public class Motor implements Cloneable {
    private Combustible tipo;
    private int cv;
    private boolean enMarcha;

    public Motor(Combustible tipo, int cv) {
        this.tipo = tipo;
        this.cv = cv;
    }

    public Combustible getTipo() {
        return tipo;
    }

    public void setTipo(Combustible tipo) {
        this.tipo = tipo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    @Override
    public String toString() {
        return "Motor [" +
                " Tipo:" + getTipo() +
                " | CV:" + getCv() +
                " | En Marcha: " + isEnMarcha() +
                " ]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
