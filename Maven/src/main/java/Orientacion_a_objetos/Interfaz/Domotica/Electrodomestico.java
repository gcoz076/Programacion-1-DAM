package Orientacion_a_objetos.Interfaz.Domotica;

public abstract class Electrodomestico implements Inteligente {

    private String codigoSerie;
    private String marca;
    protected double consumoEnergetico;
    protected EstadoElectrodomestico estado;
    private boolean conectado;

    public Electrodomestico(String codigoSerie, String marca, double consumoEnergetico) {
        this.codigoSerie = codigoSerie;
        this.marca = marca;
        this.consumoEnergetico = consumoEnergetico >= 0 ? consumoEnergetico : 0;
        this.estado = EstadoElectrodomestico.APAGADO;
        this.conectado = false;
    }

    @Override
    public void conectar() {
        conectado = true;
        System.out.println(codigoSerie + " conectado a WiFi.");
    }

    @Override
    public void desconectar() {
        conectado = false;
        System.out.println(codigoSerie + " desconectado de WiFi.");
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }

    @Override
    public void encender() {
        estado = EstadoElectrodomestico.ENCENDIDO;
        System.out.println(codigoSerie + " encendido.");
    }

    @Override
    public void apagar() {
        estado = EstadoElectrodomestico.APAGADO;
        System.out.println(codigoSerie + " apagado.");
    }

    @Override
    public String getCodigoSerie() {
        return codigoSerie;
    }

    public EstadoElectrodomestico getEstado() {
        return estado;
    }
}
