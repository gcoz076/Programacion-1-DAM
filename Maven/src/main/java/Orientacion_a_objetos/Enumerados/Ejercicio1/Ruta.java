package Orientacion_a_objetos.Enumerados.Ejercicio1;

public class Ruta {

    // Atributos
    private String origen;
    private String destino;
    private double pesoPaquete;
    private EstadoPaquete estado;

     // Constructor
    public Ruta(String origen, String destino, double pesoPaquete) {
        this.origen = origen;
        this.destino = destino;
        this.pesoPaquete = pesoPaquete;
        this.estado = EstadoPaquete.EN_PREPARACION;
    }

    // Getter
    public double getPesoPaquete() {
        return pesoPaquete;
    }

    // Metodo
     void aniadirEstado(EstadoPaquete estado) {
        this.estado = estado;
    }

     EstadoPaquete obtenerEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", pesoPaquete=" + pesoPaquete +
                ", estado=" + estado +
                '}';
    }
}