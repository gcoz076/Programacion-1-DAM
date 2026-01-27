package Boletin_Tablas;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la longitud que quieres que tenga la tabla: ");
        int longitudTabla = scanner.nextInt();
        int[] tabla = new int[longitudTabla];

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Dime los numeros de la tabla: ");
            tabla[i] = scanner.nextInt();
        }

        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    int aux = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = aux;
                }
            }
        }

        System.out.print("Tabla ordenada: ");
        for (int num : tabla) {
            System.out.print(num + " ");
        }
    }
}
