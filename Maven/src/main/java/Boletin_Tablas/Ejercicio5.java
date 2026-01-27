package Boletin_Tablas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Longitud de la primera tabla:");
        int longitud1 = scanner.nextInt();
        int[] tabla1 = new int[longitud1];

        System.out.println("Introduce los valores de la primera tabla (ordenados):");
        for (int i = 0; i < tabla1.length; i++) {
            tabla1[i] = scanner.nextInt();
        }

        System.out.println("Longitud de la segunda tabla:");
        int longitud2 = scanner.nextInt();
        int[] tabla2 = new int[longitud2];

        System.out.println("Introduce los valores de la segunda tabla (ordenados):");
        for (int i = 0; i < tabla2.length; i++) {
            tabla2[i] = scanner.nextInt();
        }

        boolean iguales = true;

        if (tabla1.length != tabla2.length) {
            iguales = false;
        } else {
            for (int i = 0; i < tabla1.length; i++) {
                if (tabla1[i] != tabla2[i]) {
                    iguales = false;
                }
            }
        }

        if (iguales) {
            System.out.println("Las tablas tienen los mismos valores.");
        } else {
            System.out.println("Las tablas NO tienen los mismos valores.");
        }
    }
}

