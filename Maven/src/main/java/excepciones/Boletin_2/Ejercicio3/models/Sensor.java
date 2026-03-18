package excepciones.Boletin_2.Ejercicio3.models;

import excepciones.Boletin_2.Ejercicio3.exceptions.SensorException;
import java.time.LocalDateTime;

public class Sensor {

    private static int contador = 1;

    private int id;
    private String tipoParametro;
    private double min;
    private double max;

    private Lectura[] historial;
    private int totalLecturas;

    public Sensor(String tipoParametro, double min, double max) {

        this.id = contador++;
        this.tipoParametro = tipoParametro;
        this.min = min;
        this.max = max;

        historial = new Lectura[100];
        totalLecturas = 0;
    }

    public int getId() {
        return id;
    }

    public void registrarLectura(double valor, LocalDateTime timestamp) throws SensorException {

        if (totalLecturas > 0) {

            LocalDateTime ultima = historial[totalLecturas - 1].getTimestamp();

            if (timestamp.isBefore(ultima)) {

                throw new SensorException("Sensor " + id + " timestamp incorrecto: " + timestamp + " < " + ultima);
            }
        }

        boolean anomala = false;

        if (valor < min || valor > max) {
            anomala = true;
        }

        if (totalLecturas < 100) {

            historial[totalLecturas] = new Lectura(valor, timestamp, anomala);
            totalLecturas++;

        }
    }

    public boolean demasiadasAnomalias() {

        int contadorAnomalias = 0;

        for (int i = 0; i < totalLecturas; i++) {

            if (historial[i] != null && historial[i].isAnomala()) {
                contadorAnomalias++;
            }
        }

        return totalLecturas > 0 && contadorAnomalias >= totalLecturas / 3;
    }
}
