package Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.models;

import java.time.LocalDate;

public class CamaraSeguridad implements DispositivoWifi {

    private String mac;
    private EstadoWifi estado;
    private LocalDate fechaActualizacion;

    public CamaraSeguridad(String mac) {

        this.mac = mac;
        this.estado = EstadoWifi.On_SinWifi;
        this.fechaActualizacion = LocalDate.now();
    }

    @Override
    public void conectarInternet() {

        estado = EstadoWifi.On_Conectado;
        System.out.println("Conectado usando WPA3");
    }

    @Override
    public boolean pendienteActualizacion() {

        boolean pendiente;

        LocalDate hoy = LocalDate.now();

        if (fechaActualizacion.plusWeeks(2).isBefore(hoy)) {
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

        String texto = "Cámara MAC: " + mac +
                " | Estado: " + estado;

        return texto;
    }
}
