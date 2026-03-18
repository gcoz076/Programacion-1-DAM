package Orientacion_a_objetos.Herencias.HerenciaVehiculo;

public class Camion {
    private double mma;
    private int pasajeros;
    private TipoCarnet carnet;

    public Camion(double mma, int pasajeros, TipoCarnet carnet) {
        this.mma = mma;
        this.pasajeros = pasajeros;
        this.carnet = carnet;
    }

    public double getMma() { return mma; }
    public int getPasajeros() { return pasajeros; }
    public TipoCarnet getCarnet() { return carnet; }

    // Lógica de circulación según carnet, MMA y pasajeros
    public boolean tieneLicenciaParaCircular() {
        boolean puedeCircular = false;

        switch (carnet) {
            case C:
            case CE:
                if (pasajeros <= 9 && mma > 3500) puedeCircular = true;
                break;
            case C1:
            case C1E:
                if (pasajeros <= 9 && mma >= 3500 && mma <= 7500) puedeCircular = true;
                break;
        }

        return puedeCircular;
    }
}