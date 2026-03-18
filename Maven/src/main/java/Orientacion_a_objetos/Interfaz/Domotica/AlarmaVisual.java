package Orientacion_a_objetos.Interfaz.Domotica;

public class AlarmaVisual extends SistemaIluminacion {

    public AlarmaVisual(String codigoSerie) {
        super(codigoSerie, 0, "#FFFFFF");
    }

    public void activarModoPanico() {
        System.out.println("⚠ MODO PÁNICO ACTIVADO");
        encender();
        setIntensidad(100);
        this.color = "#FF0000";
    }
}
