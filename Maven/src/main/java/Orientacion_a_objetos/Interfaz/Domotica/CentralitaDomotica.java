package Orientacion_a_objetos.Interfaz.Domotica;

public class CentralitaDomotica {

    private Inteligente[] dispositivos = new Inteligente[10];
    private int contador = 0;

    public void aniadirDispositivos(Inteligente dispositivo) {
        if (contador < 10) {
            dispositivos[contador++] = dispositivo;
            System.out.println("Dispositivo añadido.");
        } else {
            System.out.println("Error: Centralita llena.");
        }
    }

    public Inteligente buscarDispositivo(String codigoSerie) {
        for (Inteligente d : dispositivos) {
            if (d != null && d.getCodigoSerie().equals(codigoSerie)) {
                System.out.println("Dispositivo encontrado: " + codigoSerie);
                return d;
            }
        }
        System.out.println("Dispositivo no encontrado.");
        return null;
    }

    public void ejecutarRutinaDiaria() {
        for (Inteligente d : dispositivos) {
            if (d != null) {
                d.encender();
            }
        }
    }
}
