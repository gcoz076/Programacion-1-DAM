package Boletin_Tablas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que longitud quieres en la lista?");
        int longitud = scanner.nextInt();

        int[] tabla = new int[longitud];

        System.out.println("Indica los numeros (no es necesario que estén ordenados):");
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = scanner.nextInt();
        }

        System.out.println("¿Que número quieres buscar?");
        int buscarNumero = scanner.nextInt();

        int posicion = -1;
        boolean encontrado = false;

        for (int i = 0; i < tabla.length; i++) {

            if (!encontrado && tabla[i] == buscarNumero) {
                posicion = i;
                encontrado = true;
            }
        }

        System.out.println("Resultado: " + posicion);
    }
}