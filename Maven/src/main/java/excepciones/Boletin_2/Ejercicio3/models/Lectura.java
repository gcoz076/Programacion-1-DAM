package excepciones.Boletin_2.Ejercicio3.models;

import java.time.LocalDateTime;

public class Lectura {
    private double valor;
    private LocalDateTime timestamp;
    private boolean anomala;

    public Lectura(double valor, LocalDateTime timestamp, boolean anomala) {
        this.valor = valor;
        this.timestamp = timestamp;
        this.anomala = anomala;
    }

    public boolean isAnomala() {
        return anomala;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}