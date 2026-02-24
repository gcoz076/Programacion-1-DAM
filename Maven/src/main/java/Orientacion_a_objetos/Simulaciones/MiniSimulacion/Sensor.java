package Orientacion_a_objetos.Simulaciones.MiniSimulacion;

public class Sensor {

    //Atributos
    private double distanciaObstaculo; // en cms
    private double velocidad; // en km/h

    //Constructor
    public Sensor(double distanciaObstaculo, double velocidad) {
        this.distanciaObstaculo = distanciaObstaculo;
        this.velocidad = velocidad;
    }

    //Metodo
    public boolean hayObstaculoCercano() {
        return distanciaObstaculo < 50;
    }

    public boolean velocidadAlta() {
        return velocidad > 120;
    }

    //Guetter
    public double getDistancia() {
        return distanciaObstaculo;
    }

    public double getVelocidad() {
        return velocidad;
    }
}

