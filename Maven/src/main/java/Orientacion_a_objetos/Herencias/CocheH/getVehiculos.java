package Orientacion_a_objetos.Herencias.CocheH;

public class getVehiculos {
    public static void main(String[] args) {
        // Coches
        Vehiculo coche1 = new Coche("1111AAA", "ECO", 5);
        Vehiculo coche2 = new Coche("2222BBB", "C", 3);

        System.out.println("Coche ECO limitado en Madrid: " +
                coche1.tieneLimitacionParaCircular("Madrid"));

        System.out.println("Coche ECO limitado en Sevilla: " +
                coche1.tieneLimitacionParaCircular("Sevilla"));

        System.out.println("Coche C limitado en Madrid: " +
                coche2.tieneLimitacionParaCircular("Madrid"));

        System.out.println("Coche C limitado en Sevilla: " +
                coche2.tieneLimitacionParaCircular("Sevilla"));


        // Camiones
        Vehiculo camion1 = new Camion("1234AAA", "C", 500, 1, "C");
        Vehiculo camion2 = new Camion("4321BBB", "C", 5000, 7, "C1");

        System.out.println(camion1);
        System.out.println(camion2);

        System.out.println("Camion1 puede conducirse: " +
                ((Camion) camion1).puedeConducirse());

        System.out.println("Camion2 puede conducirse: " +
                ((Camion) camion2).puedeConducirse());
    }

}
