package Repaso;

import java.util.Scanner;

public class Java_Racing_Team {
    public void menu(){
        System.out.println("=========================");
        System.out.println("========= MENU ==========");
        System.out.println("=========================");
        System.out.println("1. Cargar/Reiniciar Datos");
        System.out.println("2. Formatear Nombres");
        System.out.println("3. Ver Estadísticas");
        System.out.println("4. Buscar Piloto");
        System.out.println("5. Generat IDs de Carrera");
        System.out.println("6. Salir");
        System.out.println("=========================");
    }

    public int inicializaEscuderia(Scanner scanner, String[] nombresP, double[] tiemposP){
        System.out.println("¿Cuantos pilotos deseas registrar?");
        int numPilotos = scanner.nextInt();

        for (int i = 0; i < numPilotos; i++) {
            System.out.println("Dime el nombre del piloto: ");
            nombresP[i] = scanner.next();

            System.out.println("Dime el tiempo de vuelta de " + nombresP[i]);
            double tiempo = scanner.nextDouble();
            while(tiempo < 0){
                System.out.println("El tiempo es incorrecto, debe ser positivo:");
                tiempo = scanner.nextDouble();
            }
            tiemposP[i] = tiempo;

        }

        return numPilotos;
    }

    public void formatearPilotos(String[] nombresP, int numPilotos) {
        System.out.println("Formateando nombres...");

        int i = 0;
        while (i < numPilotos) {
            nombresP[i] = nombresP[i].toUpperCase();
            nombresP[i] = nombresP[i].trim();
            if (nombresP[i].length() > 10) {
                nombresP[i] = nombresP[i].substring(0,10) + ".";
            }
            i = i + 1;
        }
        System.out.println("Formateo terminado.");
    }

    public void estadisticas(String[] nombresP, double[] tiemposP, int numPilotos) {

        if (numPilotos == 0) {
            System.out.println("No hay pilotos registrados.");
        }

        double sumaTiempos = 0;
        double mejorTiempo = tiemposP[0];
        double peorTiempo = tiemposP[0];
        String mejorPiloto = nombresP[0];
        String peorPiloto = nombresP[0];

        System.out.println("=== ESTADÍSTICAS ===");

        for (int i = 0; i < numPilotos; i++) {
            System.out.println("Piloto: " + nombresP[i] + " | Tiempo: " + tiemposP[i]);
            sumaTiempos += tiemposP[i];

            if (tiemposP[i] < mejorTiempo) {
                mejorTiempo = tiemposP[i];
                mejorPiloto = nombresP[i];
            }

            if (tiemposP[i] > peorTiempo) {
                peorTiempo = tiemposP[i];
                peorPiloto = nombresP[i];
            }
        }

        double tiempoMedio = sumaTiempos / numPilotos;

        System.out.println("---------------------");
        System.out.println("Tiempo medio: " + tiempoMedio);
        System.out.println("Mejor piloto: " + mejorPiloto + " (" + mejorTiempo + ")");
        System.out.println("Peor piloto: " + peorPiloto + " (" + peorTiempo + ")");
    }

    public void buscarPiloto(String[] nombresP, double[] tiemposP, int numPilotos, Scanner scanner) {

        if (numPilotos == 0) {
            System.out.println("No hay pilotos registrados.");
            return;
        }

        System.out.println("Introduce el nombre del piloto a buscar:");
        String nombreBuscado = scanner.next();

        nombreBuscado = nombreBuscado.toUpperCase();

        boolean encontrado = false;
        double tiempoEncontrado = -1;

        int i = 0;
        while (i < numPilotos && !encontrado) {

            if (nombresP[i].toUpperCase().equals(nombreBuscado)) {
                tiempoEncontrado = tiemposP[i];
                encontrado = true;
            }

            i++;
        }

        if (encontrado) {
            System.out.println("El tiempo de " + nombreBuscado + " es: " + tiempoEncontrado);
        } else {
            System.out.println("Piloto no encontrado.");
        }
    }

    public String[] generarIDS(String[] nombresP, int numPilotos) {

        String[] ids = new String[numPilotos];

        System.out.println("=== IDs DE PILOTOS ===");

        int i = 0;
        while (i < numPilotos) {

            String nombre = nombresP[i];
            String tresLetras;

            if (nombre.length() >= 3) {
                tresLetras = nombre.substring(0, 3);
            } else {
                tresLetras = nombre;
            }

            ids[i] = tresLetras + "-" + i;
            System.out.println("Piloto: " + nombre + " -> ID: " + ids[i]);

            i++;
        }

        return ids;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Java_Racing_Team racing = new Java_Racing_Team();
        racing.menu();

        String[] nombresP = new String[100];
        double[] tiemposP = new double[100];

        racing.menu();
        System.out.println("Dime una opción del menú: ");
        int opcion = scanner.nextInt();
        int numPilotosGuardados = 0;

        while (opcion != 6){
            if (opcion == 1){
                numPilotosGuardados = racing.inicializaEscuderia(scanner, nombresP, tiemposP);
            }
            else if (opcion == 2) {
                racing.formatearPilotos(nombresP, numPilotosGuardados);
            }
            else if (opcion == 3) {
                racing.estadisticas(nombresP, tiemposP, numPilotosGuardados);
            }
            else if (opcion == 4) {
                racing.buscarPiloto(nombresP, tiemposP, numPilotosGuardados, scanner);
            }
            else if (opcion == 5) {
                String[] ids = racing.generarIDS(nombresP, numPilotosGuardados);
            }
            else {
                System.out.println("Saliendo del programa...");
            }
            racing.menu();
            System.out.println("Dime una opción del menú");
            opcion = scanner.nextInt();
        }
    }
}