package Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio1_craps ref = new Ejercicio1_craps();
        Random aleatorio = new Random();

        int dados = aleatorio.nextInt(12) + 1;
        int opcion = scanner.nextInt();
        int contador = 0;
        int dineroGanado = 0;
        int dineroPerdido = 0;
        double totalDinero = 0;
        String [] historial = new String[20];
        String partidas = ref.apostar(scanner, dados, historial, contador, totalDinero);
        ref.menu(opcion, ref, partidas, contador, historial, totalDinero);


    }

    public void menu(int opcion, Ejercicio1_craps ref, String partidas, int contador, String[] historial, double totalDinero) {

        System.out.println("===========================");
        System.out.println("Bienvenido a 777 Casino.com");
        System.out.println("===========================");
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar historial");
        System.out.println("3. Retirarse");
        System.out.println("===========================");

        switch (opcion) {
            case 1:
                System.out.println(partidas);
                break;

            case 2:
                ref.mostrarHistorial(contador, historial);
                break;

            case 3:
                ref.imprimeResumen(historial, contador, totalDinero);
                break;
        }
    }


    public String apostar(Scanner scanner, int dados, String [] historial, int contador, double totalDinero) {

        System.out.println("=== ¿Cual es el numero por el cual apuestas? ===");
        int apuesta = scanner.nextInt();
        System.out.println("=== ¿Que cantidad de dinero apuestas? ===");
        int dineroApostado = scanner.nextInt();

        String partida;

        if (apuesta == dados) {
            dineroApostado = dineroApostado * 2;
            contador += 1;
            partida = "En la " + contador + "º jugada apostó al valor " + apuesta + " y los dados dieron " + dados + ", ganando " + dineroApostado + ".";
            totalDinero += dineroApostado;
        }
        else {
            contador += 1;
            partida = "En la " + contador + "º jugada apostó al valor " + apuesta + " y los dados dieron " + dados + ", perdiendo " + dineroApostado + ".";
            dineroApostado -= dineroApostado;
            totalDinero -= dineroApostado;
        }

        historial[contador] = partida;
        return partida;
    }

    void mostrarHistorial(int contador, String[] historial){
        for (int i = 0; i < contador; i++) {
            System.out.println(historial[i]);
        }
    }

    void imprimeResumen(String[] historial, int contador, double totalDinero) {
        System.out.println("Tras tantas apuestas te has quedado con " + totalDinero + "$ en el banco.");
    }
}
