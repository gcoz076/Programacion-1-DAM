package Orientacion_a_objetos.Herencias.HerenciaVehiculo;

public class GestionaVehiculos {

    public static void main(String[] args) {

        // --- Automoviles ---
        Automovil autoB = new Automovil("Juan", 4, 4, "Euro5");
        CocheElectrico cocheEco = new CocheElectrico("Ana", 5, 4, "Eco", TipoBateria.NCM);

        System.out.println("--- Comprobación de automóviles ---");
        System.out.println("Auto B puede circular en Madrid? " +
                autoB.tieneLicenciaParaCircular("Madrid", TipoVehiculo.B));
        System.out.println("Coche eléctrico puede circular en Madrid? " +
                cocheEco.tieneLicenciaParaCircular("Madrid", cocheEco.getTipoVehiculo()));
        System.out.println("Auto B puede circular en Sevilla? " +
                autoB.tieneLicenciaParaCircular("Sevilla", TipoVehiculo.B));
        System.out.println("Coche eléctrico puede circular en Sevilla? " +
                cocheEco.tieneLicenciaParaCircular("Sevilla", cocheEco.getTipoVehiculo()));

        // --- Camiones ---
        Camion camion1 = new Camion(500, 1, TipoCarnet.C);
        Camion camion2 = new Camion(5000, 7, TipoCarnet.C1);

        System.out.println("\n--- Comprobación de camiones ---");
        System.out.println("Camion1 puede circular? " + camion1.tieneLicenciaParaCircular());
        System.out.println("Camion2 puede circular? " + camion2.tieneLicenciaParaCircular());
    }
}
