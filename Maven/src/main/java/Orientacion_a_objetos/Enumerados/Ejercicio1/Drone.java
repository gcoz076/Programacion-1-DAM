package Orientacion_a_objetos.Enumerados.Ejercicio1;

public class Drone {

    // Atributos
    private String id;
    private int bateria;
    private double cargaMax;
    private EstadoDrone estado;
    private Ruta ruta;

    // Constructor
    public Drone(String id, double cargaMax) {
        this.id = id;
        this.cargaMax = cargaMax;
        this.bateria = 100;
        this.estado = EstadoDrone.EN_REPOSO;
    }

    // Getter
    public Ruta getRuta() {
        return ruta;
    }
    public EstadoDrone getEstado(){
        return estado;
    }

    // Metodos
    void asignarRuta(Ruta ruta) {
        if (estado == EstadoDrone.EN_REPOSO) {
            if ( getRuta().getPesoPaquete() <= cargaMax) {
                this.ruta = ruta;
                this.estado = EstadoDrone.EN_RUTA;
                ruta.aniadirEstado(EstadoPaquete.EN_REPARTO);
                System.out.println("Ruta asignada al drone " + id);
            }
            else {
                System.out.println("No es posible asignar la ruta al drone " + id +
                        " debido al peso del paquete. Estado actual: " + estado);
            }
        } else {
            System.out.println("No es posible asignar la ruta al drone " + id +
                    ". Estado actual: " + estado);
        }
    }

    void cargarBateria() {
        this.estado = EstadoDrone.CARGANDO;
        this.bateria = 100;
        System.out.println("Drone " + id + " cargado al 100%");
        this.estado = EstadoDrone.EN_REPOSO;
    }
}