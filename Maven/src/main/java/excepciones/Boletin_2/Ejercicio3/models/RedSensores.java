package excepciones.Boletin_2.Ejercicio3.models;

import excepciones.Boletin_2.Ejercicio3.exceptions.SensorException;
import excepciones.Boletin_2.Ejercicio3.exceptions.FalloCriticoException;

public class RedSensores {

    private Sensor[] sensores;
    private int totalSensores;

    public RedSensores() {

        sensores = new Sensor[50];
        totalSensores = 0;
    }

    public void addSensor(Sensor s) {

        if (totalSensores < 50) {

            sensores[totalSensores] = s;
            totalSensores++;
        }
    }

    public void validarSensores() throws SensorException, FalloCriticoException {

        int sensoresFallidos = 0;

        for (int i = 0; i < totalSensores; i++) {
            try {
                if (sensores[i] != null && sensores[i].demasiadasAnomalias()) {
                    sensoresFallidos++;
                    throw new SensorException("Sensor " + sensores[i].getId() + " tiene demasiadas lecturas anómalas");
                }
            } catch (SensorException e) {
                throw e;
            }
        }

        if (sensoresFallidos > totalSensores / 2) {
            throw new FalloCriticoException("Fallo crítico: más de la mitad de sensores fallan");
        }
    }
}
