package Orientacion_a_objetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public class ControlMisiones {

    public static void main(String[] args) {

        Comandante c1 = new Comandante("12345678A", "Juan Pérez", Rango.CAPITAN);
        Comandante c2 = new Comandante("87654321B", "Laura Gómez", Rango.COMANDANTE);

        Nave nave1 = new Nave("N001", "Falcon-X", 1200, c1);
        Nave nave2 = new Nave("N002", "Orion-Z", 800, c2);


        // Crear Misiones
        Mision mision1 = new Exploracion(101, "Exploración Roja", LocalDate.of(2026, 5, 10), nave1, EstadoMision.Planificada, "MARTE", 5);

        Mision mision2 = new Logistica(202, "Carga Lunar", LocalDate.of(2026, 3, 7), nave2, EstadoMision.En_vuelo, 75.0);

        // Mostrar información
        System.out.println("===== MISIONES =====");
        System.out.println(mision1);
        System.out.println(mision2);

        System.out.println("\n===== EVALUACIÓN DE RIESGO =====");
        mision1.evaluacionRiesgo();
        mision2.evaluacionRiesgo();
    }
}