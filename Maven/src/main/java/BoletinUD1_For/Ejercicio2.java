package BoletinUD1_For;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número para la longitud de un triangulo: ");
        int longitud = sc.nextInt();
        String cadena = "";

        for (int i = 0; i < longitud; i++) {
            cadena = cadena + "*";
            System.out.println(cadena);
        }
    }
}
