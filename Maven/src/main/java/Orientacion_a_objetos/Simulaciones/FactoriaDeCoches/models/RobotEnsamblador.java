package Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.models;

public class RobotEnsamblador extends Robot {

    public RobotEnsamblador(String modelo, EstadoRobot estado, double bateria, String combustible) {
        super(modelo, estado, bateria, "Gasolina");
    }

    @Override
    public String ejecutarTarea() {
        String tarea = "Ensamblando piezas";
        return tarea;
    }

    @Override
    public boolean recargar() {

        boolean puedeRecargar;
        if (getEstado().equals(EstadoRobot.Apagado)) {
            System.out.println("Recargando por gasolina");
            setBateria(100);
            puedeRecargar = true;
        }
        else {
            System.out.println("Estoy encendido y no puedo recargar");
            puedeRecargar = false;
        }
        return puedeRecargar;
    }
}
