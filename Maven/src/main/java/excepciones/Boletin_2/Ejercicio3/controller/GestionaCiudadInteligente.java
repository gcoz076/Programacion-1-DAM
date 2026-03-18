package excepciones.Boletin_2.Ejercicio3.controller;

import excepciones.Boletin_2.Ejercicio3.models.*;
import excepciones.Boletin_2.Ejercicio3.exceptions.*;

import java.time.LocalDateTime;

public class GestionaCiudadInteligente {
    public static void main(String[] args) {

        RedSensores red = new RedSensores();

        Sensor s1 = new Sensor("Temperatura", 10, 30);
        Sensor s2 = new Sensor("CO2", 300, 1000);

        red.addSensor(s1);
        red.addSensor(s2);

        try {

            s1.registrarLectura(20, LocalDateTime.now());
            s1.registrarLectura(22, LocalDateTime.now().plusSeconds(5));

            s1.registrarLectura(200, LocalDateTime.now().plusSeconds(10)); // anómala

            s1.registrarLectura(25, LocalDateTime.now().minusSeconds(20)); // ERROR timestamp

        } catch (SensorException e) {

            System.out.println("ERROR SENSOR: " + e.getMessage());
        }

        try {

            red.validarSensores();

        } catch (SensorException e) {

            System.out.println("ALERTA SENSOR: " + e.getMessage());

        } catch (FalloCriticoException e) {

            System.out.println("FALLO CRÍTICO: " + e.getMessage());
        }

        System.out.println("El sistema continúa funcionando.");
    }
}
