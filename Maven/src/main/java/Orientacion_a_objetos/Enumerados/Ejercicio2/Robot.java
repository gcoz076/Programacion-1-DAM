package Orientacion_a_objetos.Enumerados.Ejercicio2;

public class Robot {

    // Atributos
    private String id;
    private int nivelDeposito;
    private int bateria;
    private ModoRobot modo;
    private Habitacion habitacion;

     // Constructor
    public Robot(String id) {
        this.id = id;
        this.nivelDeposito = 0;
        this.bateria = 100;
        this.modo = ModoRobot.AUTO;
    }

    // Metodo
     void asignarHabitacion(Habitacion h) {
        if (modo == ModoRobot.AUTO && h.getEstado() == EstadoHabitacion.LIBRE) {
            this.habitacion = h;
            h.aniadirEstado(EstadoHabitacion.LIMPIANDO);
            System.out.println("Robot " + id + " limpiando habitación " + h);
        } else {
            System.out.println("No se puede asignar la habitación al robot " + id);
        }
    }

     void vaciarDeposito() {
        nivelDeposito = 0;
        System.out.println("Depósito del robot " + id + " vaciado");
    }

     void recargar() {
        bateria = 100;
        modo = ModoRobot.DOCKED;
        System.out.println("Robot " + id + " recargado al 100%");
    }
}

