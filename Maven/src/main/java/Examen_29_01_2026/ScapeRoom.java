package Examen_29_01_2026;

import java.util.Random;
import java.util.Scanner;

public class ScapeRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ScapeRoom sr = new ScapeRoom();
        Random rd = new Random(6);

        int[] codigos = new int[5];
        String[] estados = new String[5];

        sr.menu(scan, sr, codigos, rd, estados);

    }

    void menu(Scanner scan, ScapeRoom sr, int[] codigos, Random rd, String[] estados){
        System.out.println("==========");
        System.out.println("== Menu ==");
        System.out.println("==========");
        System.out.println("G) Generar partida");
        System.out.println("A) Intenta abrir una sala");
        System.out.println("E) Estado del scape room");
        System.out.println("S) Salir");
        System.out.println("==========");

        System.out.println("Dime la opción que deseas elegir: ");
        String opcion = scan.next().toUpperCase();

        while (!opcion.equals("S")){
            switch (opcion){
                case "G":
                    sr.generarPartida(codigos, rd, estados);
                    break;

                case "A":
                    sr.intentaAbrir(codigos, estados, scan);
                    break;

                case "E":
                    sr.mostrarEstado(estados);
                    break;
            }
            System.out.println("==========");
            System.out.println("== Menu ==");
            System.out.println("==========");
            System.out.println("G) Generar partida");
            System.out.println("A) Intenta abrir una sala");
            System.out.println("E) Estado del scape room");
            System.out.println("S) Salir");
            System.out.println("==========");

            System.out.println("Dime la opción que deseas elegir: ");
            opcion = scan.next().toUpperCase();
        }
    }

    void generarPartida(int[] codigos, Random rd, String[] estados){
        System.out.println("Generando codigos...");
        for (int i = 0; i < codigos.length; i++) {
            codigos[i] = rd.nextInt();
        }
        System.out.println("¡¡Listo!!");
        System.out.println("Generando estado de las salas...");
        for (int j = 0; j < estados.length; j++) {
            estados[j] = "Bloqueada";
        }
        System.out.println("¡¡Listo!!");
        System.out.println("Partida Generada con exito");
    }

    void intentaAbrir(int[] codigos, String[] estados, Scanner scan){
        int intentos = 0;
        boolean salir = false;

        System.out.println("Dime una sala para intentar abrirla");
        int sala = scan.nextInt();

        System.out.println("¿Dime cual crees que es el código?");
        int intento = scan.nextInt();

        while (intento != codigos[sala] || !salir) {
            System.out.println("código incorrecto, vuelve a intentar");
            intento = scan.nextInt();

            if (intentos == 3){
                System.out.println("La sala a quedado invalidada");
                estados[sala] = "Invalida";
                salir = true;
            }
            intentos++;
        }
        if (intento == codigos[sala]) {
            System.out.println("¡¡La sala a sido abierta con exito!!");
        }
    }


    void mostrarEstado(String[] estados){

        int contadorB = 0;
        int contadorA = 0;
        int contadorI = 0;

        for (int i = 0; i < estados.length; i++) {

            if (estados[i].equals("Bloqueada")){
                contadorB++;
            }
            else if (estados[i].equals("Abierta")){
                contadorA++;
            }
            else {
                contadorI++;
            }

            System.out.println("Sala "+ i +":"+ estados[i] +".");
        }
        System.out.println("Número de salas Bloqueadas: "+ contadorB);
        System.out.println("Número de salas Abiertas: "+ contadorA);
        System.out.println("Número de salas Invalidas: "+ contadorI);
    }
}
