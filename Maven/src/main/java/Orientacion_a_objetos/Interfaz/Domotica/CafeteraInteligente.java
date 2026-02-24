package Orientacion_a_objetos.Interfaz.Domotica;

public class CafeteraInteligente extends Electrodomestico {

    private double nivelAgua;

    public CafeteraInteligente(String codigoSerie, String marca, double consumo, double nivelAgua) {
        super(codigoSerie, marca, consumo);
        this.nivelAgua = nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public void prepararCafe() {
        if (nivelAgua < 10) {
            System.out.println("⚠ Nivel de agua bajo. No se puede preparar café.");
            return;
        }

        if (getEstado() == EstadoElectrodomestico.ENCENDIDO && estaConectado()) {
            System.out.println("Preparando café...");
            nivelAgua -= 10;
        } else {
            System.out.println("La cafetera debe estar encendida y conectada.");
        }
    }
}