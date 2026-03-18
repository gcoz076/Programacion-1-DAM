package StrangerThings.Models;

public abstract class  CriaturaUpsideDown extends EntidadStrangerThings{
    //Atributos
    private double nivelInfeccion;

    //Constructores
    public CriaturaUpsideDown(String nombre, double nivelInfeccion) {
        super(nombre);
        this.nivelInfeccion = nivelInfeccion;
    }

    public CriaturaUpsideDown(String nombre, double saludBase, double nivelInfeccion) {
        super(nombre, saludBase);
        this.nivelInfeccion = nivelInfeccion;
    }

    public double getNivelInfeccion() {
        return nivelInfeccion;
    }

    public void setNivelInfeccion(double nivelInfeccion) {
        this.nivelInfeccion = nivelInfeccion;
    }
    //Metodos

    @Override
    public double calcularDannoPotencial(int factorAmenaza) {
        if (nivelInfeccion < 0.0){
            this.nivelInfeccion = 0.0;
        }
        else if (nivelInfeccion > 1.0) {
            this.nivelInfeccion = 1.0;
        }

        double dannoBase = getSaludBase()*(1+nivelInfeccion);
        if (nivelInfeccion > 0.8){
            dannoBase = +50;
        }
        return dannoBase;
    }
}
