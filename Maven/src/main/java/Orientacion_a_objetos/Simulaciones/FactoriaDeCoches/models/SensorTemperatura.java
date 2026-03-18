package Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.models;

import java.time.LocalDate;

public class SensorTemperatura implements DispositivoWifi {

    private int id;
    private String mac;
    private EstadoWifi estado;
    private LocalDate fechaActualizacion;
    private double temperatura;

    public SensorTemperatura(int id, String mac, double temperatura) {

        this.id = id;
        this.mac = mac;
        this.temperatura = temperatura;

        this.estado = EstadoWifi.On_SinWifi;
        this.fechaActualizacion = LocalDate.now();
    }

    @Override
    public void conectarInternet() {

        estado = EstadoWifi.On_Conectado;
        System.out.println("Conectado usando WPA");
    }

    @Override
    public boolean pendienteActualizacion() {

        boolean pendiente;

        LocalDate hoy = LocalDate.now();

        if (fechaActualizacion.plusMonths(3).isBefore(hoy)) {
            pendiente = true;
        } else {
            pendiente = false;
        }

        return pendiente;
    }

    @Override
    public void apagar() {

        estado = EstadoWifi.Off;
    }

    @Override
    public String toString() {

        String texto = "Sensor MAC: " + mac +
                " | Estado: " + estado;

        return texto;
    }
}
