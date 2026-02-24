package Orientacion_a_objetos.Interfaz.Domotica;

public class LavadoraInteligente extends Electrodomestico {

    public LavadoraInteligente(String codigoSerie, String marca, double consumo) {
        super(codigoSerie, marca, consumo);
    }

    public void iniciarCicloLavado() {
        if (getEstado() == EstadoElectrodomestico.ENCENDIDO && estaConectado()) {
            int tiempoEstimado = 90;
            System.out.println("Ciclo iniciado. Tiempo estimado: " + tiempoEstimado + " minutos.");
        } else {
            System.out.println("No se puede iniciar el ciclo. Verifique estado y conexión.");
        }
    }
}
