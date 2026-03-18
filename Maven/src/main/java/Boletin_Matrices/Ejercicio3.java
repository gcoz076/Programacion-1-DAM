package Boletin_Matrices;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        Ejercicio3 ref = new Ejercicio3();
        Random aleatorio = new Random();
        int[][] galaxia = new int[5][5];
        for (int i = 0; i < galaxia.length; i++) {
            for (int j = 0; j < galaxia.length; j++) {
                galaxia[i][j] = aleatorio.nextInt(100);
            }
        }
        ref.menu();
        Scanner sc = new Scanner(System.in);
        int eleccion = sc.nextInt();
        while (eleccion != 4) {
            switch (eleccion) {
                case 1:
                    ref.identificarAmenazas(galaxia);
                    break;
                case 2:
                    ref.calcularEscudo(galaxia);
                    break;
                case 3:
                    ref.encontarRefugio(galaxia);
                    break;
            }
            ref.menu();
            eleccion = sc.nextInt();
        }
        System.out.println("Saliendo...");
    }

    public void menu() {
        System.out.println("1. Identificar Amenazas");
        System.out.println("2. Calcular el escudo");
        System.out.println("3. Encontar el refugio");
        System.out.println("4. Salir");
    }

    public void identificarAmenazas(int[][] galaxia) {
        for (int i = 0; i < galaxia.length; i++) {
            for (int j = 0; j < galaxia.length; j++) {
                if (galaxia[i][j] > 80) {
                    System.out.println("Posible amenaza encontrada: x " + i + " y " + j);
                }
            }
        }
    }

    public void calcularEscudo(int[][] galaxia) {
        int suma = 0;
        int columna = 0;
        for (int i = 0; i < galaxia.length; i++) {
            for (int j = 0; j < galaxia.length; j++) {
                columna = galaxia[i][j];
                suma = suma + columna;
            }
        }
        System.out.println("El escudo es: " + suma);
        if (suma > 1000) {
            System.out.println("Los escudos deben estar al 100%");
        } else {
            System.out.println("La energia calculada no es superior a 1000");
        }
    }

    public void encontarRefugio(int[][] galaxia) {
        int refugio = galaxia[0][0];
        int columna = 0;
        int posX = 0;
        int posY = 0;

        for (int i = 0; i < galaxia.length; i++) {
            for (int j = 0; j < galaxia.length; j++) {
                columna = galaxia[i][j];
                if (refugio > columna) {
                    refugio = columna;
                    posX = i;
                    posY = j;
                }

            }
        }
        System.out.println("El refugio es: " + refugio);
        System.out.println("El refugio está en la fila " + posX + " y en la columna " + posY + ".");
    }
}
