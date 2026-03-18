package Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.controller;

import Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.models.*;

public class GestionaFactoria {

    public static void main(String[] args) {

        Robot[] inventarioRobots = new Robot[20];
        DispositivoWifi[] inventarioDispositivos = new DispositivoWifi[40];

        int contadorRobots = 0;
        int contadorDispositivos = 0;

        // 🔹 Crear un robot de cada tipo
        Robot r1 = new RobotSoldador("SoldadorX",
                EstadoRobot.Apagado,
                50,
                "Electricidad",
                1500,
                "ISO9001"
        );

        Robot r2 = new RobotPintor(
                "PintorPro",
                EstadoRobot.Encendido,
                80,
                "Electricidad"
        );

        Robot r3 = new RobotEnsamblador(
                "EnsambladorZ",
                EstadoRobot.Apagado,
                20,
                "Gasolina"
        );

        // 🔹 Insertarlos usando contador
        inventarioRobots[contadorRobots] = r1;
        contadorRobots++;

        inventarioRobots[contadorRobots] = r2;
        contadorRobots++;

        inventarioRobots[contadorRobots] = r3;
        contadorRobots++;

        // 🔹 Crear un dispositivo de cada tipo
        DispositivoWifi d1 = new SensorTemperatura(1, "AA:BB:CC", 25.5);
        DispositivoWifi d2 = new CamaraSeguridad("DD:EE:FF");
        DispositivoWifi d3 = new PuertaAutomatica("GG:HH:II");

        // 🔹 Insertarlos usando contador
        inventarioDispositivos[contadorDispositivos] = d1;
        contadorDispositivos++;

        inventarioDispositivos[contadorDispositivos] = d2;
        contadorDispositivos++;

        inventarioDispositivos[contadorDispositivos] = d3;
        contadorDispositivos++;

        // 🔹 Mostrar robots
        System.out.println("=== INVENTARIO ROBOTS ===");

        for (int i = 0; i < contadorRobots; i++) {
            System.out.println(inventarioRobots[i]);
        }

        // 🔹 Mostrar dispositivos
        System.out.println("\n=== INVENTARIO DISPOSITIVOS ===");

        for (int i = 0; i < contadorDispositivos; i++) {
            System.out.println(inventarioDispositivos[i]);
        }
    }
}