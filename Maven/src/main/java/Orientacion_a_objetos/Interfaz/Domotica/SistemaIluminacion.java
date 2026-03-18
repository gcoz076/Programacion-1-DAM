package Orientacion_a_objetos.Interfaz.Domotica;

public abstract class SistemaIluminacion implements Inteligente {

    private String codigoSerie;
    private int intensidad;
    protected String color;
    private boolean encendida;
    private boolean conectado;

    public SistemaIluminacion(String codigoSerie, int intensidad, String color) {
        this.codigoSerie = codigoSerie;
        setIntensidad(intensidad);
        this.color = color;
    }

    @Override
    public void conectar() { conectado = true; }

    @Override
    public void desconectar() { conectado = false; }

    @Override
    public boolean estaConectado() { return conectado; }

    @Override
    public void encender() {
        encendida = true;
        System.out.println(codigoSerie + " encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println(codigoSerie + " apagada.");
    }

    public void setIntensidad(int intensidad) {
        if (intensidad >= 0 && intensidad <= 100)
            this.intensidad = intensidad;
    }

    @Override
    public String getCodigoSerie() {
        return codigoSerie;
    }
}
