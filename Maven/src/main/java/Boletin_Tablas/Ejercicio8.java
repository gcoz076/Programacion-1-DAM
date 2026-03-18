package Boletin_Tablas;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la longitud que quieres que tenga la tabla: ");
        int longitudTabla = scanner.nextInt();
        int[] tabla = new int[longitudTabla];

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Dime los numeros de la tabla: ");
            tabla[i] = scanner.nextInt();
        }

        int [] tablaCopia = new int[longitudTabla];
        for (int i = 0; i < tabla.length; i++) {
            int numTabla = tabla[i];
            tablaCopia[i] = numTabla;
        }

        System.out.print("Tabla original: ");
        for (int numero : tabla) {
            System.out.print(numero + " ");
        }
        System.out.println(" ");
        System.out.print("Tabla copiada: ");
        for (int num : tablaCopia){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println(tabla);
        System.out.println(tablaCopia);
    }
}
