package Orientacion_a_objetos.Enumerados.Ejercicio1;

public class GestionaDrones {

    public static void main(String[] args) {

        Ruta ruta1 = new Ruta("Madrid", "Barcelona", 2.0);
        Ruta ruta2 = new Ruta("Sevilla", "Granada", 3.5);
        Ruta ruta3 = new Ruta("Valencia", "Alicante", 3.0);

        Drone drone1 = new Drone("DR-01", 5.0);
        Drone drone2 = new Drone("DR-02", 4.0);

        drone1.asignarRuta(ruta1);
        drone2.asignarRuta(ruta2);

        ruta1.aniadirEstado(EstadoPaquete.RETRASADO);
        ruta2.aniadirEstado(EstadoPaquete.CANCELADO);

        drone2.cargarBateria();

        drone1.asignarRuta(ruta3);

        System.out.println("\n--- ESTADOS FINALES ---");
        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(ruta3);
    }
}