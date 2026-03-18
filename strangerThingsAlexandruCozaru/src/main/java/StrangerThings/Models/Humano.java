package StrangerThings.Models;

public class Humano extends EntidadStrangerThings {
    //Atributo
    private boolean tieneEquipo;

    //Constructor
    public Humano(String nombre, boolean tieneEquipo) {
        super(nombre);
        this.tieneEquipo = tieneEquipo;
    }

    public Humano(String nombre, double saludBase, boolean tieneEquipo) {
        super(nombre, saludBase);
        this.tieneEquipo = tieneEquipo;
    }

    public boolean isTieneEquipo() {
        return tieneEquipo;
    }

    public void setTieneEquipo(boolean tieneEquipo) {
        this.tieneEquipo = tieneEquipo;
    }

    //Metodos
    @Override
    public double calcularDannoPotencial(int factorAmenaza) {
        double dannoBase = getSaludBase()*0.1*factorAmenaza;
        if (tieneEquipo){
            dannoBase += 20.0;

        }
        return dannoBase;
    }
}
