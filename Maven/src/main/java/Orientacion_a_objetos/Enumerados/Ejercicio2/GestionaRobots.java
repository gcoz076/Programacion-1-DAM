package Orientacion_a_objetos.Enumerados.Ejercicio2;

public class GestionaRobots {

    public static void main(String[] args) {

        Habitacion h1 = new Habitacion("Oficina", 25, 60);
        Habitacion h2 = new Habitacion("Sala Reuniones", 40, 80);
        Habitacion h3 = new Habitacion("Pasillo", 30, 40);

        Robot r1 = new Robot("RB-01");
        Robot r2 = new Robot("RB-02");

        r1.asignarHabitacion(h1);
        r2.asignarHabitacion(h2);

        h1.aniadirEstado(EstadoHabitacion.BLOQUEADA);

        r2.asignarHabitacion(h3);
    }
}