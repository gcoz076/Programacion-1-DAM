package Orientacion_a_objetos.Interfaz.Domotica;

public class BombillaRegulable extends SistemaIluminacion {

    public BombillaRegulable(String codigoSerie, int intensidad, String color) {
        super(codigoSerie, intensidad, color);
    }

    @Override
    public void apagar() {
        System.out.println("Reduciendo intensidad gradualmente...");
        for (int i = 100; i >= 0; i -= 20) {
            System.out.println("Intensidad: " + i);
        }
        super.apagar();
    }

    public void cambiarAmbiente(String codigoHex) {
        if (codigoHex.matches("^#[0-9A-Fa-f]{6}$")) {
            this.color = codigoHex;
            System.out.println("Color cambiado a " + codigoHex);
        } else {
            System.out.println("Código hexadecimal inválido.");
        }
    }
}
