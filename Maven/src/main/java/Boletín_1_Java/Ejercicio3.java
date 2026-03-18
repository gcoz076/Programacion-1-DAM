package Boletín_1_Java;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el alto del rectángulo: ");
        int alto = scanner.nextInt();
        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = scanner.nextInt();
        int area = alto * ancho;
        System.out.println("El área del rectángulo es: " + area);
    }
}
