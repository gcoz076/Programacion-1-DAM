package Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.models;

public class RobotSoldador extends Robot {
    //Atributo
    private double temperatura;
    private String especificacion;

    //constructor, getter y setter
    public RobotSoldador(int id, String modelo, EstadoRobot estado, double bateria, String combustible, double temperatura, String especificacion) {
        super(id, modelo, estado, bateria, combustible);
        this.temperatura = temperatura;
        this.especificacion = especificacion;
        setCombustible("Electricidad");
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }



    //Metodos
    @Override
    public String ejecutarTarea() {
        String tarea = "Su tarea es realizar soldaduras precisas en la carrocería del automóvil";
        if (getEstado().equals(EstadoRobot.Encendido) && esSuficiente()) {
            System.out.println(tarea);
        }
        return tarea;
    }

    @Override
    public boolean recargar(){
        boolean puede;
        if (getEstado().equals(EstadoRobot.Apagado)){
            System.out.println("Recargando por electricidad");
            puede = true;
        }
        else {
            System.out.println("Estoy encendido y no puedo recargar");
            puede = false;
        }
        return puede;
    }
}
