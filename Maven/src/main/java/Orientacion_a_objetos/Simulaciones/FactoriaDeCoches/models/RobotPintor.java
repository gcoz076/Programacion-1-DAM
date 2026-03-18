package Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.models;

public class RobotPintor extends Robot{
    //Constructor
    public RobotPintor(String modelo, EstadoRobot estado, double bateria, String combustible) {
        super(modelo, estado, bateria, combustible);
        setCombustible("Electricidad");
    }

    //Metodos
    @Override
    public String ejecutarTarea() {
        String tarea = "aplica pintura a los vehículos de manera uniforme";
        if (getEstado().equals(EstadoRobot.Encendido) && esSuficiente()) {
            System.out.println(tarea);
        }
        return tarea;
    }

    @Override
    public boolean recargar() {
        System.out.println("Recargando por electricidad");
        return true;
    }
}
